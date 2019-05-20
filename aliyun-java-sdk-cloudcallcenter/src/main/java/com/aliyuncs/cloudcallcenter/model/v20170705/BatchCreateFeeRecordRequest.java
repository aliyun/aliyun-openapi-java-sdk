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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class BatchCreateFeeRecordRequest extends RpcAcsRequest<BatchCreateFeeRecordResponse> {
	
	public BatchCreateFeeRecordRequest() {
		super("CloudCallCenter", "2017-07-05", "BatchCreateFeeRecord", "CloudCallCenter", "innerAPI");
	}

	private List<Record> records;

	public List<Record> getRecords() {
		return this.records;
	}

	public void setRecords(List<Record> records) {
		this.records = records;	
		if (records != null) {
			for (int depth1 = 0; depth1 < records.size(); depth1++) {
				putQueryParameter("Record." + (depth1 + 1) + ".statusCode" , records.get(depth1).getStatusCode());
				putQueryParameter("Record." + (depth1 + 1) + ".duration" , records.get(depth1).getDuration());
				putQueryParameter("Record." + (depth1 + 1) + ".caller" , records.get(depth1).getCaller());
				putQueryParameter("Record." + (depth1 + 1) + ".taobaoMainUid" , records.get(depth1).getTaobaoMainUid());
				putQueryParameter("Record." + (depth1 + 1) + ".callee" , records.get(depth1).getCallee());
				putQueryParameter("Record." + (depth1 + 1) + ".bizId" , records.get(depth1).getBizId());
				putQueryParameter("Record." + (depth1 + 1) + ".endTime" , records.get(depth1).getEndTime());
				putQueryParameter("Record." + (depth1 + 1) + ".startTime" , records.get(depth1).getStartTime());
				putQueryParameter("Record." + (depth1 + 1) + ".taobaoUid" , records.get(depth1).getTaobaoUid());
				putQueryParameter("Record." + (depth1 + 1) + ".mainRamId" , records.get(depth1).getMainRamId());
				putQueryParameter("Record." + (depth1 + 1) + ".ramId" , records.get(depth1).getRamId());
				putQueryParameter("Record." + (depth1 + 1) + ".origDuration" , records.get(depth1).getOrigDuration());
			}
		}	
	}

	public static class Record {

		private String statusCode;

		private Integer duration;

		private String caller;

		private Long taobaoMainUid;

		private String callee;

		private String bizId;

		private Long endTime;

		private Long startTime;

		private Long taobaoUid;

		private Long mainRamId;

		private Long ramId;

		private Integer origDuration;

		public String getStatusCode() {
			return this.statusCode;
		}

		public void setStatusCode(String statusCode) {
			this.statusCode = statusCode;
		}

		public Integer getDuration() {
			return this.duration;
		}

		public void setDuration(Integer duration) {
			this.duration = duration;
		}

		public String getCaller() {
			return this.caller;
		}

		public void setCaller(String caller) {
			this.caller = caller;
		}

		public Long getTaobaoMainUid() {
			return this.taobaoMainUid;
		}

		public void setTaobaoMainUid(Long taobaoMainUid) {
			this.taobaoMainUid = taobaoMainUid;
		}

		public String getCallee() {
			return this.callee;
		}

		public void setCallee(String callee) {
			this.callee = callee;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
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

		public Long getTaobaoUid() {
			return this.taobaoUid;
		}

		public void setTaobaoUid(Long taobaoUid) {
			this.taobaoUid = taobaoUid;
		}

		public Long getMainRamId() {
			return this.mainRamId;
		}

		public void setMainRamId(Long mainRamId) {
			this.mainRamId = mainRamId;
		}

		public Long getRamId() {
			return this.ramId;
		}

		public void setRamId(Long ramId) {
			this.ramId = ramId;
		}

		public Integer getOrigDuration() {
			return this.origDuration;
		}

		public void setOrigDuration(Integer origDuration) {
			this.origDuration = origDuration;
		}
	}

	@Override
	public Class<BatchCreateFeeRecordResponse> getResponseClass() {
		return BatchCreateFeeRecordResponse.class;
	}

}
