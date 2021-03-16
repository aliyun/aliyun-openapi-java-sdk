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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryExceptionNameByAlarmIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryExceptionNameByAlarmIdResponse extends AcsResponse {

	private String requestId;

	private List<AlarmConfigInfo> alarmConfigInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AlarmConfigInfo> getAlarmConfigInfos() {
		return this.alarmConfigInfos;
	}

	public void setAlarmConfigInfos(List<AlarmConfigInfo> alarmConfigInfos) {
		this.alarmConfigInfos = alarmConfigInfos;
	}

	public static class AlarmConfigInfo {

		private String exceptionName;

		private String alarmId;

		public String getExceptionName() {
			return this.exceptionName;
		}

		public void setExceptionName(String exceptionName) {
			this.exceptionName = exceptionName;
		}

		public String getAlarmId() {
			return this.alarmId;
		}

		public void setAlarmId(String alarmId) {
			this.alarmId = alarmId;
		}
	}

	@Override
	public OpsQueryExceptionNameByAlarmIdResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryExceptionNameByAlarmIdResponseUnmarshaller.unmarshall(this, context);
	}
}
