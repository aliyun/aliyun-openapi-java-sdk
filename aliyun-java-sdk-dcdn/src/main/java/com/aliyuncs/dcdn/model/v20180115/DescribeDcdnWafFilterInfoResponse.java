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

package com.aliyuncs.dcdn.model.v20180115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnWafFilterInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnWafFilterInfoResponse extends AcsResponse {

	private String requestId;

	private List<FilterInfo> content;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FilterInfo> getContent() {
		return this.content;
	}

	public void setContent(List<FilterInfo> content) {
		this.content = content;
	}

	public static class FilterInfo {

		private String defenseScene;

		private List<Field> fields;

		public String getDefenseScene() {
			return this.defenseScene;
		}

		public void setDefenseScene(String defenseScene) {
			this.defenseScene = defenseScene;
		}

		public List<Field> getFields() {
			return this.fields;
		}

		public void setFields(List<Field> fields) {
			this.fields = fields;
		}

		public static class Field {

			private String extendField;

			private String matchField;

			private List<Logic> logicalSymbol;

			public String getExtendField() {
				return this.extendField;
			}

			public void setExtendField(String extendField) {
				this.extendField = extendField;
			}

			public String getMatchField() {
				return this.matchField;
			}

			public void setMatchField(String matchField) {
				this.matchField = matchField;
			}

			public List<Logic> getLogicalSymbol() {
				return this.logicalSymbol;
			}

			public void setLogicalSymbol(List<Logic> logicalSymbol) {
				this.logicalSymbol = logicalSymbol;
			}

			public static class Logic {

				private String type;

				private String symbol;

				private String tip;

				private Integer maxLength;

				private String description;

				private Regexp regexp;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getSymbol() {
					return this.symbol;
				}

				public void setSymbol(String symbol) {
					this.symbol = symbol;
				}

				public String getTip() {
					return this.tip;
				}

				public void setTip(String tip) {
					this.tip = tip;
				}

				public Integer getMaxLength() {
					return this.maxLength;
				}

				public void setMaxLength(Integer maxLength) {
					this.maxLength = maxLength;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public Regexp getRegexp() {
					return this.regexp;
				}

				public void setRegexp(Regexp regexp) {
					this.regexp = regexp;
				}

				public static class Regexp {

					private String pattern;

					private String errMsg;

					public String getPattern() {
						return this.pattern;
					}

					public void setPattern(String pattern) {
						this.pattern = pattern;
					}

					public String getErrMsg() {
						return this.errMsg;
					}

					public void setErrMsg(String errMsg) {
						this.errMsg = errMsg;
					}
				}
			}
		}
	}

	@Override
	public DescribeDcdnWafFilterInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnWafFilterInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
