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

package com.aliyuncs.marketplaceintl.model.v20221230;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PushMeteringDataRequest extends RpcAcsRequest<PushMeteringDataResponse> {
	   

	private List<MeteringData> meteringDatas;

	private String gmtCreate;
	public PushMeteringDataRequest() {
		super("marketplaceIntl", "2022-12-30", "PushMeteringData");
		setMethod(MethodType.POST);
	}

	public List<MeteringData> getMeteringDatas() {
		return this.meteringDatas;
	}

	public void setMeteringDatas(List<MeteringData> meteringDatas) {
		this.meteringDatas = meteringDatas;	
		if (meteringDatas != null) {
			for (int depth1 = 0; depth1 < meteringDatas.size(); depth1++) {
				putBodyParameter("MeteringData." + (depth1 + 1) + ".MeteringAssist" , meteringDatas.get(depth1).getMeteringAssist());
				putBodyParameter("MeteringData." + (depth1 + 1) + ".PushOrderBizId" , meteringDatas.get(depth1).getPushOrderBizId());
				putBodyParameter("MeteringData." + (depth1 + 1) + ".InstanceId" , meteringDatas.get(depth1).getInstanceId());
				putBodyParameter("MeteringData." + (depth1 + 1) + ".EndTime" , meteringDatas.get(depth1).getEndTime());
				putBodyParameter("MeteringData." + (depth1 + 1) + ".StartTime" , meteringDatas.get(depth1).getStartTime());
				putBodyParameter("MeteringData." + (depth1 + 1) + ".MeteringEntity" , meteringDatas.get(depth1).getMeteringEntity());
			}
		}	
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
		if(gmtCreate != null){
			putBodyParameter("GmtCreate", gmtCreate);
		}
	}

	public static class MeteringData {

		private String meteringAssist;

		private String pushOrderBizId;

		private String instanceId;

		private Long endTime;

		private Long startTime;

		private String meteringEntity;

		public String getMeteringAssist() {
			return this.meteringAssist;
		}

		public void setMeteringAssist(String meteringAssist) {
			this.meteringAssist = meteringAssist;
		}

		public String getPushOrderBizId() {
			return this.pushOrderBizId;
		}

		public void setPushOrderBizId(String pushOrderBizId) {
			this.pushOrderBizId = pushOrderBizId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public String getMeteringEntity() {
			return this.meteringEntity;
		}

		public void setMeteringEntity(String meteringEntity) {
			this.meteringEntity = meteringEntity;
		}
	}

	@Override
	public Class<PushMeteringDataResponse> getResponseClass() {
		return PushMeteringDataResponse.class;
	}

}
