/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aliyuncs.threaded;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadedClientSample {
	
	public static void main(String args[]) {
		ExecutorService pool = Executors.newFixedThreadPool(3);
		Thread t1 = new LaunchDeleteInstanceTask();
		Thread t2 = new LaunchDeleteInstanceTask();
		Thread t3 = new LaunchDeleteInstanceTask();
		pool.execute(t1);
		pool.execute(t2);
		pool.execute(t3);
		pool.shutdown();
		
		try {
			pool.awaitTermination(10, TimeUnit.SECONDS);
			System.out.print("3 ECS Instance created.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
