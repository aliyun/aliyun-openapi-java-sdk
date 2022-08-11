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

package com.aliyuncs.ft.model.v20180713;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ft.transform.v20180713.BatchAuditTest01ResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchAuditTest01Response extends AcsResponse {

	private String requestId;

	private String name;

	private Demo01 demo01;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Demo01 getDemo01() {
		return this.demo01;
	}

	public void setDemo01(Demo01 demo01) {
		this.demo01 = demo01;
	}

	public static class Demo01 {

		private List<Demo011Item> demo011;

		public List<Demo011Item> getDemo011() {
			return this.demo011;
		}

		public void setDemo011(List<Demo011Item> demo011) {
			this.demo011 = demo011;
		}

		public static class Demo011Item {

			private String demo0111;

			public String getDemo0111() {
				return this.demo0111;
			}

			public void setDemo0111(String demo0111) {
				this.demo0111 = demo0111;
			}
		}
	}

	@Override
	public BatchAuditTest01Response getInstance(UnmarshallerContext context) {
		return	BatchAuditTest01ResponseUnmarshaller.unmarshall(this, context);
	}
}
