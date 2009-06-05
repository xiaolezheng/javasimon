package org.javasimon.jmx;

import org.javasimon.Stopwatch;
import org.javasimon.Simon;

/**
 * StopwatchMXBeanImpl.
 *
 * @author <a href="mailto:virgo47@gmail.com">Richard "Virgo" Richter</a>
 * @created Mar 6, 2009
 */
public class StopwatchMXBeanImpl extends AbstractSimonMXBeanImpl implements StopwatchMXBean {
	private Stopwatch stopwatch;

	/**
	 * Creates the MX bean for the provided Stopwatch.
	 *
	 * @param stopwatch wrapped Stopwatch
	 */
	protected StopwatchMXBeanImpl(Stopwatch stopwatch) {
		this.stopwatch = stopwatch;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public final void addTime(long ns) {
		stopwatch.addTime(ns);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public final long getLast() {
		return stopwatch.getLast();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public final StopwatchSample sample() {
		return new StopwatchSample((org.javasimon.StopwatchSample) stopwatch.sample());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public final StopwatchSample sampleAndReset() {
		return new StopwatchSample((org.javasimon.StopwatchSample) stopwatch.sampleAndReset());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected final Simon simon() {
		return stopwatch;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public final String getType() {
		return "Stopwatch";
	}
}
