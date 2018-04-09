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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListSlsLogstoreInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSlsLogstoreInfoResponse extends AcsResponse {

	private String requestId;

	private List<SlsLogstoreInfo> slsLogstoreInfoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SlsLogstoreInfo> getSlsLogstoreInfoList() {
		return this.slsLogstoreInfoList;
	}

	public void setSlsLogstoreInfoList(List<SlsLogstoreInfo> slsLogstoreInfoList) {
		this.slsLogstoreInfoList = slsLogstoreInfoList;
	}

	public static class SlsLogstoreInfo {

		private Long id;

		private String serviceName;

		private String componentName;

		private String logstoreName;

		private String logType;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getComponentName() {
			return this.componentName;
		}

		public void setComponentName(String componentName) {
			this.componentName = componentName;
		}

		public String getLogstoreName() {
			return this.logstoreName;
		}

		public void setLogstoreName(String logstoreName) {
			this.logstoreName = logstoreName;
		}

		public String getLogType() {
			return this.logType;
		}

		public void setLogType(String logType) {
			this.logType = logType;
		}
	}

	@Override
	public ListSlsLogstoreInfoResponse getInstance(UnmarshallerContext context) {
		return	ListSlsLogstoreInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
