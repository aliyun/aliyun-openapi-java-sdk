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

package com.aliyuncs.qualitycheck.model.v20190115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20190115.GetWarningStrategyConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetWarningStrategyConfigResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long id;

		private Long intervalTime;

		private String lambda;

		private Long level;

		private Long maxNumber;

		private String name;

		private List<WarningStrategyListItem> warningStrategyList;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getIntervalTime() {
			return this.intervalTime;
		}

		public void setIntervalTime(Long intervalTime) {
			this.intervalTime = intervalTime;
		}

		public String getLambda() {
			return this.lambda;
		}

		public void setLambda(String lambda) {
			this.lambda = lambda;
		}

		public Long getLevel() {
			return this.level;
		}

		public void setLevel(Long level) {
			this.level = level;
		}

		public Long getMaxNumber() {
			return this.maxNumber;
		}

		public void setMaxNumber(Long maxNumber) {
			this.maxNumber = maxNumber;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<WarningStrategyListItem> getWarningStrategyList() {
			return this.warningStrategyList;
		}

		public void setWarningStrategyList(List<WarningStrategyListItem> warningStrategyList) {
			this.warningStrategyList = warningStrategyList;
		}

		public static class WarningStrategyListItem {

			private String code;

			private Long duration;

			private Long durationExpression;

			private Long hitNumber;

			private Long hitNumberExpression;

			private String hitRuleList;

			private Long hitType;

			private Long id;

			private Long status;

			private Range range;

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public Long getDuration() {
				return this.duration;
			}

			public void setDuration(Long duration) {
				this.duration = duration;
			}

			public Long getDurationExpression() {
				return this.durationExpression;
			}

			public void setDurationExpression(Long durationExpression) {
				this.durationExpression = durationExpression;
			}

			public Long getHitNumber() {
				return this.hitNumber;
			}

			public void setHitNumber(Long hitNumber) {
				this.hitNumber = hitNumber;
			}

			public Long getHitNumberExpression() {
				return this.hitNumberExpression;
			}

			public void setHitNumberExpression(Long hitNumberExpression) {
				this.hitNumberExpression = hitNumberExpression;
			}

			public String getHitRuleList() {
				return this.hitRuleList;
			}

			public void setHitRuleList(String hitRuleList) {
				this.hitRuleList = hitRuleList;
			}

			public Long getHitType() {
				return this.hitType;
			}

			public void setHitType(Long hitType) {
				this.hitType = hitType;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Long getStatus() {
				return this.status;
			}

			public void setStatus(Long status) {
				this.status = status;
			}

			public Range getRange() {
				return this.range;
			}

			public void setRange(Range range) {
				this.range = range;
			}

			public static class Range {

				private Long rangeNum;

				private Long type;

				public Long getRangeNum() {
					return this.rangeNum;
				}

				public void setRangeNum(Long rangeNum) {
					this.rangeNum = rangeNum;
				}

				public Long getType() {
					return this.type;
				}

				public void setType(Long type) {
					this.type = type;
				}
			}
		}
	}

	@Override
	public GetWarningStrategyConfigResponse getInstance(UnmarshallerContext context) {
		return	GetWarningStrategyConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
