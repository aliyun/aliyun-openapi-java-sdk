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
import com.aliyuncs.ecsops.transform.v20160401.OpsStatisticOpsRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsStatisticOpsRuleResponse extends AcsResponse {

	private String requestId;

	private Integer endTimeStamp;

	private Integer startTimeStamp;

	private Integer intervalTime;

	private Integer timeCnt;

	private List<String> ncCnts;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getEndTimeStamp() {
		return this.endTimeStamp;
	}

	public void setEndTimeStamp(Integer endTimeStamp) {
		this.endTimeStamp = endTimeStamp;
	}

	public Integer getStartTimeStamp() {
		return this.startTimeStamp;
	}

	public void setStartTimeStamp(Integer startTimeStamp) {
		this.startTimeStamp = startTimeStamp;
	}

	public Integer getIntervalTime() {
		return this.intervalTime;
	}

	public void setIntervalTime(Integer intervalTime) {
		this.intervalTime = intervalTime;
	}

	public Integer getTimeCnt() {
		return this.timeCnt;
	}

	public void setTimeCnt(Integer timeCnt) {
		this.timeCnt = timeCnt;
	}

	public List<String> getNcCnts() {
		return this.ncCnts;
	}

	public void setNcCnts(List<String> ncCnts) {
		this.ncCnts = ncCnts;
	}

	@Override
	public OpsStatisticOpsRuleResponse getInstance(UnmarshallerContext context) {
		return	OpsStatisticOpsRuleResponseUnmarshaller.unmarshall(this, context);
	}
}
