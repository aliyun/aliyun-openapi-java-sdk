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

package com.aliyuncs.trademark.model.v20190902;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20190902.QueryActivityItemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryActivityItemsResponse extends AcsResponse {

	private Module module;

	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public static class Module {

		private String data;

		private String floorItems;

		private List<Floor> floorDisplayInfos;

		public String getData() {
			return this.data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public String getFloorItems() {
			return this.floorItems;
		}

		public void setFloorItems(String floorItems) {
			this.floorItems = floorItems;
		}

		public List<Floor> getFloorDisplayInfos() {
			return this.floorDisplayInfos;
		}

		public void setFloorDisplayInfos(List<Floor> floorDisplayInfos) {
			this.floorDisplayInfos = floorDisplayInfos;
		}

		public static class Floor {

			private String name;

			private String title;

			private Integer index;

			private String icon;

			private List<SubFloor> subTitles;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public Integer getIndex() {
				return this.index;
			}

			public void setIndex(Integer index) {
				this.index = index;
			}

			public String getIcon() {
				return this.icon;
			}

			public void setIcon(String icon) {
				this.icon = icon;
			}

			public List<SubFloor> getSubTitles() {
				return this.subTitles;
			}

			public void setSubTitles(List<SubFloor> subTitles) {
				this.subTitles = subTitles;
			}

			public static class SubFloor {

				private String name;

				private String title;

				private String value;

				private String icon;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getTitle() {
					return this.title;
				}

				public void setTitle(String title) {
					this.title = title;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getIcon() {
					return this.icon;
				}

				public void setIcon(String icon) {
					this.icon = icon;
				}
			}
		}
	}

	@Override
	public QueryActivityItemsResponse getInstance(UnmarshallerContext context) {
		return	QueryActivityItemsResponseUnmarshaller.unmarshall(this, context);
	}
}
