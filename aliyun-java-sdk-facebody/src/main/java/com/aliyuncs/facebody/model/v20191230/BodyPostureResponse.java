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

package com.aliyuncs.facebody.model.v20191230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.facebody.transform.v20191230.BodyPostureResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BodyPostureResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<Output> outputs;

		private MetaObject metaObject;

		public List<Output> getOutputs() {
			return this.outputs;
		}

		public void setOutputs(List<Output> outputs) {
			this.outputs = outputs;
		}

		public MetaObject getMetaObject() {
			return this.metaObject;
		}

		public void setMetaObject(MetaObject metaObject) {
			this.metaObject = metaObject;
		}

		public static class Output {

			private Integer humanCount;

			private List<Result> results;

			public Integer getHumanCount() {
				return this.humanCount;
			}

			public void setHumanCount(Integer humanCount) {
				this.humanCount = humanCount;
			}

			public List<Result> getResults() {
				return this.results;
			}

			public void setResults(List<Result> results) {
				this.results = results;
			}

			public static class Result {

				private List<Body> bodies;

				public List<Body> getBodies() {
					return this.bodies;
				}

				public void setBodies(List<Body> bodies) {
					this.bodies = bodies;
				}

				public static class Body {

					private Float confident;

					private String label;

					private List<Position> positions;

					public Float getConfident() {
						return this.confident;
					}

					public void setConfident(Float confident) {
						this.confident = confident;
					}

					public String getLabel() {
						return this.label;
					}

					public void setLabel(String label) {
						this.label = label;
					}

					public List<Position> getPositions() {
						return this.positions;
					}

					public void setPositions(List<Position> positions) {
						this.positions = positions;
					}

					public static class Position {

						private List<Float> points;

						public List<Float> getPoints() {
							return this.points;
						}

						public void setPoints(List<Float> points) {
							this.points = points;
						}
					}
				}
			}
		}

		public static class MetaObject {

			private Integer height;

			private Integer width;

			public Integer getHeight() {
				return this.height;
			}

			public void setHeight(Integer height) {
				this.height = height;
			}

			public Integer getWidth() {
				return this.width;
			}

			public void setWidth(Integer width) {
				this.width = width;
			}
		}
	}

	@Override
	public BodyPostureResponse getInstance(UnmarshallerContext context) {
		return	BodyPostureResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
