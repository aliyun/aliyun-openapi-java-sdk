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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeAllImageBaselineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAllImageBaselineResponse extends AcsResponse {

	private String requestId;

	private ImageBaselines imageBaselines;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ImageBaselines getImageBaselines() {
		return this.imageBaselines;
	}

	public void setImageBaselines(ImageBaselines imageBaselines) {
		this.imageBaselines = imageBaselines;
	}

	public static class ImageBaselines {

		private List<BaselineClass> baselineClassList;

		public List<BaselineClass> getBaselineClassList() {
			return this.baselineClassList;
		}

		public void setBaselineClassList(List<BaselineClass> baselineClassList) {
			this.baselineClassList = baselineClassList;
		}

		public static class BaselineClass {

			private String classKey;

			private String alias;

			private List<BaselineName> baselineNameList;

			public String getClassKey() {
				return this.classKey;
			}

			public void setClassKey(String classKey) {
				this.classKey = classKey;
			}

			public String getAlias() {
				return this.alias;
			}

			public void setAlias(String alias) {
				this.alias = alias;
			}

			public List<BaselineName> getBaselineNameList() {
				return this.baselineNameList;
			}

			public void setBaselineNameList(List<BaselineName> baselineNameList) {
				this.baselineNameList = baselineNameList;
			}

			public static class BaselineName {

				private String nameKey;

				private String classKey;

				private String alias;

				private List<BaselineItem> baselineItemList;

				public String getNameKey() {
					return this.nameKey;
				}

				public void setNameKey(String nameKey) {
					this.nameKey = nameKey;
				}

				public String getClassKey() {
					return this.classKey;
				}

				public void setClassKey(String classKey) {
					this.classKey = classKey;
				}

				public String getAlias() {
					return this.alias;
				}

				public void setAlias(String alias) {
					this.alias = alias;
				}

				public List<BaselineItem> getBaselineItemList() {
					return this.baselineItemList;
				}

				public void setBaselineItemList(List<BaselineItem> baselineItemList) {
					this.baselineItemList = baselineItemList;
				}

				public static class BaselineItem {

					private String nameKey;

					private String itemKey;

					private String classKey;

					private String alias;

					public String getNameKey() {
						return this.nameKey;
					}

					public void setNameKey(String nameKey) {
						this.nameKey = nameKey;
					}

					public String getItemKey() {
						return this.itemKey;
					}

					public void setItemKey(String itemKey) {
						this.itemKey = itemKey;
					}

					public String getClassKey() {
						return this.classKey;
					}

					public void setClassKey(String classKey) {
						this.classKey = classKey;
					}

					public String getAlias() {
						return this.alias;
					}

					public void setAlias(String alias) {
						this.alias = alias;
					}
				}
			}
		}
	}

	@Override
	public DescribeAllImageBaselineResponse getInstance(UnmarshallerContext context) {
		return	DescribeAllImageBaselineResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
