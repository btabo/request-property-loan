package com.ibmi.mortgage.steps.application.cucumber;

import java.util.function.Consumer;
import java.util.function.Supplier;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Scope("cucumber-glue")
@Slf4j
public class GenericGlue<T> {

	private T result;

	private Exception errorException;

	public void exec(Supplier<T> supplier) {

		this.result = supplier.get();

	}

	public void doWithResult(Consumer<T> consummer) {

		consummer.accept(this.result);

	}

	public Exception getError() {

		return this.errorException;

	}

	public boolean haveNoError() {

		return !this.haveError();

	}

	public boolean haveError() {

		return this.errorException != null;

	}

	public T getResult() {

		return this.result;

	}

}
