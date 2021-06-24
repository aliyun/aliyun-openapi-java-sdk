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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeDemandPerformResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeDemandPerformResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private List<DemandPerformInfoModel> demandPerformInfoModelList;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DemandPerformInfoModel> getDemandPerformInfoModelList() {
		return this.demandPerformInfoModelList;
	}

	public void setDemandPerformInfoModelList(List<DemandPerformInfoModel> demandPerformInfoModelList) {
		this.demandPerformInfoModelList = demandPerformInfoModelList;
	}

	public static class DemandPerformInfoModel {

		private String status;

		private Integer amount;

		private Integer consumeCnt;

		private String subDemandId;

		private String demandId;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getAmount() {
			return this.amount;
		}

		public void setAmount(Integer amount) {
			this.amount = amount;
		}

		public Integer getConsumeCnt() {
			return this.consumeCnt;
		}

		public void setConsumeCnt(Integer consumeCnt) {
			this.consumeCnt = consumeCnt;
		}

		public String getSubDemandId() {
			return this.subDemandId;
		}

		public void setSubDemandId(String subDemandId) {
			this.subDemandId = subDemandId;
		}

		public String getDemandId() {
			return this.demandId;
		}

		public void setDemandId(String demandId) {
			this.demandId = demandId;
		}
	}

	@Override
	public OpsDescribeDemandPerformResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeDemandPerformResponseUnmarshaller.unmarshall(this, context);
	}
}
