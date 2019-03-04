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

package com.aliyuncs.bssopenapi.model.v20171214;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryUserAlarmThresholdRequest extends RpcAcsRequest<QueryUserAlarmThresholdResponse> {
	
	public QueryUserAlarmThresholdRequest() {
		super("BssOpenApi", "2017-12-14", "QueryUserAlarmThreshold");
	}

	private Long uid;

	private String alarmType;

	private String alarmThresholds;

	private String bid;

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("Uid", uid.toString());
		}
	}

	public String getAlarmType() {
		return this.alarmType;
	}

	public void setAlarmType(String alarmType) {
		this.alarmType = alarmType;
		if(alarmType != null){
			putQueryParameter("AlarmType", alarmType);
		}
	}

	public String getAlarmThresholds() {
		return this.alarmThresholds;
	}

	public void setAlarmThresholds(String alarmThresholds) {
		this.alarmThresholds = alarmThresholds;
		if(alarmThresholds != null){
			putQueryParameter("AlarmThresholds", alarmThresholds);
		}
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
		if(bid != null){
			putQueryParameter("Bid", bid);
		}
	}

	@Override
	public Class<QueryUserAlarmThresholdResponse> getResponseClass() {
		return QueryUserAlarmThresholdResponse.class;
	}

}
