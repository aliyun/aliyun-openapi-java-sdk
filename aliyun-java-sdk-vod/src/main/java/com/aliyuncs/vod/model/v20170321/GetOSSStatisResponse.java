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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.GetOSSStatisResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOSSStatisResponse extends AcsResponse {

	private String requestId;

	private Long maxStorageUtilization;

	private List<OSSMetric> ossStatisList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getMaxStorageUtilization() {
		return this.maxStorageUtilization;
	}

	public void setMaxStorageUtilization(Long maxStorageUtilization) {
		this.maxStorageUtilization = maxStorageUtilization;
	}

	public List<OSSMetric> getOssStatisList() {
		return this.ossStatisList;
	}

	public void setOssStatisList(List<OSSMetric> ossStatisList) {
		this.ossStatisList = ossStatisList;
	}

	public static class OSSMetric {

		private String statTime;

		private Long storageUtilization;

		public String getStatTime() {
			return this.statTime;
		}

		public void setStatTime(String statTime) {
			this.statTime = statTime;
		}

		public Long getStorageUtilization() {
			return this.storageUtilization;
		}

		public void setStorageUtilization(Long storageUtilization) {
			this.storageUtilization = storageUtilization;
		}
	}

	@Override
	public GetOSSStatisResponse getInstance(UnmarshallerContext context) {
		return	GetOSSStatisResponseUnmarshaller.unmarshall(this, context);
	}
}
