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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.DescribeUserStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserStatisticsResponse extends AcsResponse {

	private Long id;

	private String userId;

	private Integer jobNum;

	private Integer executePlanNum;

	private Integer interactionJobNum;

	private Integer jobMigratedNum;

	private Integer executePlanMigratedNum;

	private Integer interactionJobMigratedNum;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getJobNum() {
		return this.jobNum;
	}

	public void setJobNum(Integer jobNum) {
		this.jobNum = jobNum;
	}

	public Integer getExecutePlanNum() {
		return this.executePlanNum;
	}

	public void setExecutePlanNum(Integer executePlanNum) {
		this.executePlanNum = executePlanNum;
	}

	public Integer getInteractionJobNum() {
		return this.interactionJobNum;
	}

	public void setInteractionJobNum(Integer interactionJobNum) {
		this.interactionJobNum = interactionJobNum;
	}

	public Integer getJobMigratedNum() {
		return this.jobMigratedNum;
	}

	public void setJobMigratedNum(Integer jobMigratedNum) {
		this.jobMigratedNum = jobMigratedNum;
	}

	public Integer getExecutePlanMigratedNum() {
		return this.executePlanMigratedNum;
	}

	public void setExecutePlanMigratedNum(Integer executePlanMigratedNum) {
		this.executePlanMigratedNum = executePlanMigratedNum;
	}

	public Integer getInteractionJobMigratedNum() {
		return this.interactionJobMigratedNum;
	}

	public void setInteractionJobMigratedNum(Integer interactionJobMigratedNum) {
		this.interactionJobMigratedNum = interactionJobMigratedNum;
	}

	@Override
	public DescribeUserStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
