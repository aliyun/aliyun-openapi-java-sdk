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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetStandardStatisticsRequest extends RpcAcsRequest<GetStandardStatisticsResponse> {
	   

	private Long opTenantId;

	@SerializedName("statisticsQuery")
	private StatisticsQuery statisticsQuery;
	public GetStandardStatisticsRequest() {
		super("dataphin-public", "2023-06-30", "GetStandardStatistics");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public StatisticsQuery getStatisticsQuery() {
		return this.statisticsQuery;
	}

	public void setStatisticsQuery(StatisticsQuery statisticsQuery) {
		this.statisticsQuery = statisticsQuery;	
		if (statisticsQuery != null) {
			putBodyParameter("StatisticsQuery" , new Gson().toJson(statisticsQuery));
		}	
	}

	public static class StatisticsQuery {

		@SerializedName("CreateTimePeriod")
		private CreateTimePeriod createTimePeriod;

		@SerializedName("StandardStageList")
		private List<String> standardStageList;

		@SerializedName("Directory")
		private String directory;

		public CreateTimePeriod getCreateTimePeriod() {
			return this.createTimePeriod;
		}

		public void setCreateTimePeriod(CreateTimePeriod createTimePeriod) {
			this.createTimePeriod = createTimePeriod;
		}

		public List<String> getStandardStageList() {
			return this.standardStageList;
		}

		public void setStandardStageList(List<String> standardStageList) {
			this.standardStageList = standardStageList;
		}

		public String getDirectory() {
			return this.directory;
		}

		public void setDirectory(String directory) {
			this.directory = directory;
		}

		public static class CreateTimePeriod {

			@SerializedName("IncludeEndTime")
			private Boolean includeEndTime;

			@SerializedName("EndTime")
			private String endTime;

			@SerializedName("StartTime")
			private String startTime;

			public Boolean getIncludeEndTime() {
				return this.includeEndTime;
			}

			public void setIncludeEndTime(Boolean includeEndTime) {
				this.includeEndTime = includeEndTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}
		}
	}

	@Override
	public Class<GetStandardStatisticsResponse> getResponseClass() {
		return GetStandardStatisticsResponse.class;
	}

}
