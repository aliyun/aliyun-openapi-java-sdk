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

package com.aliyuncs.advisor_share.model.v20180608;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.advisor_share.transform.v20180608.ListCostTrendResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCostTrendResponse extends AcsResponse {

	private Boolean success;

	private Data data;

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

		private String graphName;

		private String xUnit;

		private String yUnit;

		private List<LineVOListItem> lineVOList;

		public String getGraphName() {
			return this.graphName;
		}

		public void setGraphName(String graphName) {
			this.graphName = graphName;
		}

		public String getXUnit() {
			return this.xUnit;
		}

		public void setXUnit(String xUnit) {
			this.xUnit = xUnit;
		}

		public String getYUnit() {
			return this.yUnit;
		}

		public void setYUnit(String yUnit) {
			this.yUnit = yUnit;
		}

		public List<LineVOListItem> getLineVOList() {
			return this.lineVOList;
		}

		public void setLineVOList(List<LineVOListItem> lineVOList) {
			this.lineVOList = lineVOList;
		}

		public static class LineVOListItem {

			private String name;

			private List<PointVOListItem> pointVOList;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public List<PointVOListItem> getPointVOList() {
				return this.pointVOList;
			}

			public void setPointVOList(List<PointVOListItem> pointVOList) {
				this.pointVOList = pointVOList;
			}

			public static class PointVOListItem {

				private String x;

				private String y;

				public String getX() {
					return this.x;
				}

				public void setX(String x) {
					this.x = x;
				}

				public String getY() {
					return this.y;
				}

				public void setY(String y) {
					this.y = y;
				}
			}
		}
	}

	@Override
	public ListCostTrendResponse getInstance(UnmarshallerContext context) {
		return	ListCostTrendResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
