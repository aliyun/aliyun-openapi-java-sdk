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

package com.aliyuncs.antiddos_public.model.v20170518;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.antiddos_public.transform.v20170518.DescribeDdosCreditResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDdosCreditResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private DdosCredit ddosCredit;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DdosCredit getDdosCredit() {
		return this.ddosCredit;
	}

	public void setDdosCredit(DdosCredit ddosCredit) {
		this.ddosCredit = ddosCredit;
	}

	public static class DdosCredit {

		private Integer score;

		private String scoreLevel;

		private Integer blackholeTime;

		public Integer getScore() {
			return this.score;
		}

		public void setScore(Integer score) {
			this.score = score;
		}

		public String getScoreLevel() {
			return this.scoreLevel;
		}

		public void setScoreLevel(String scoreLevel) {
			this.scoreLevel = scoreLevel;
		}

		public Integer getBlackholeTime() {
			return this.blackholeTime;
		}

		public void setBlackholeTime(Integer blackholeTime) {
			this.blackholeTime = blackholeTime;
		}
	}

	@Override
	public DescribeDdosCreditResponse getInstance(UnmarshallerContext context) {
		return	DescribeDdosCreditResponseUnmarshaller.unmarshall(this, context);
	}
}
