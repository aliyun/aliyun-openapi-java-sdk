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

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribeDiagnosisOperateRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDiagnosisOperateRecordsResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer totalCount;

	private List<DiagnosisOperateRecordModel> diagnosisOperateRecordModels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<DiagnosisOperateRecordModel> getDiagnosisOperateRecordModels() {
		return this.diagnosisOperateRecordModels;
	}

	public void setDiagnosisOperateRecordModels(List<DiagnosisOperateRecordModel> diagnosisOperateRecordModels) {
		this.diagnosisOperateRecordModels = diagnosisOperateRecordModels;
	}

	public static class DiagnosisOperateRecordModel {

		private String zoneId;

		private String instanceType;

		private String operateRecordType;

		private String newZoneId;

		private String newInstanceType;

		private String operateDate;

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getOperateRecordType() {
			return this.operateRecordType;
		}

		public void setOperateRecordType(String operateRecordType) {
			this.operateRecordType = operateRecordType;
		}

		public String getNewZoneId() {
			return this.newZoneId;
		}

		public void setNewZoneId(String newZoneId) {
			this.newZoneId = newZoneId;
		}

		public String getNewInstanceType() {
			return this.newInstanceType;
		}

		public void setNewInstanceType(String newInstanceType) {
			this.newInstanceType = newInstanceType;
		}

		public String getOperateDate() {
			return this.operateDate;
		}

		public void setOperateDate(String operateDate) {
			this.operateDate = operateDate;
		}
	}

	@Override
	public DescribeDiagnosisOperateRecordsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDiagnosisOperateRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
