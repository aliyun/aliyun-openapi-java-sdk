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

package com.aliyuncs.dcdn.model.v20180115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.ListDcdnRealTimeDeliveryProjectResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDcdnRealTimeDeliveryProjectResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<Projects> content;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Projects> getContent() {
		return this.content;
	}

	public void setContent(List<Projects> content) {
		this.content = content;
	}

	public static class Projects {

		private String projectName;

		private String type;

		private String domainName;

		private String fieldName;

		private Float samplingRate;

		private String dataCenter;

		private String sLSRegion;

		private String sLSProject;

		private String sLSLogStore;

		private String businessType;

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getFieldName() {
			return this.fieldName;
		}

		public void setFieldName(String fieldName) {
			this.fieldName = fieldName;
		}

		public Float getSamplingRate() {
			return this.samplingRate;
		}

		public void setSamplingRate(Float samplingRate) {
			this.samplingRate = samplingRate;
		}

		public String getDataCenter() {
			return this.dataCenter;
		}

		public void setDataCenter(String dataCenter) {
			this.dataCenter = dataCenter;
		}

		public String getSLSRegion() {
			return this.sLSRegion;
		}

		public void setSLSRegion(String sLSRegion) {
			this.sLSRegion = sLSRegion;
		}

		public String getSLSProject() {
			return this.sLSProject;
		}

		public void setSLSProject(String sLSProject) {
			this.sLSProject = sLSProject;
		}

		public String getSLSLogStore() {
			return this.sLSLogStore;
		}

		public void setSLSLogStore(String sLSLogStore) {
			this.sLSLogStore = sLSLogStore;
		}

		public String getBusinessType() {
			return this.businessType;
		}

		public void setBusinessType(String businessType) {
			this.businessType = businessType;
		}
	}

	@Override
	public ListDcdnRealTimeDeliveryProjectResponse getInstance(UnmarshallerContext context) {
		return	ListDcdnRealTimeDeliveryProjectResponseUnmarshaller.unmarshall(this, context);
	}
}
