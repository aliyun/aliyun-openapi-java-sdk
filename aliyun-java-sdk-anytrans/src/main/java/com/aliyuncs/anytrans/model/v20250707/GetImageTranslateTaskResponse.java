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

package com.aliyuncs.anytrans.model.v20250707;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.anytrans.transform.v20250707.GetImageTranslateTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetImageTranslateTaskResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private String httpStatusCode;

	private Boolean synchro;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Boolean getSynchro() {
		return this.synchro;
	}

	public void setSynchro(Boolean synchro) {
		this.synchro = synchro;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String traceId;

		private Translation translation;

		public String getTraceId() {
			return this.traceId;
		}

		public void setTraceId(String traceId) {
			this.traceId = traceId;
		}

		public Translation getTranslation() {
			return this.translation;
		}

		public void setTranslation(Translation translation) {
			this.translation = translation;
		}

		public static class Translation {

			private Long angle;

			private Long width;

			private Long height;

			private Long orgWidth;

			private Long orgHeight;

			private Long boxesCount;

			private List<BoundingBoxesItem> boundingBoxes;

			private List<TableInfosItem> tableInfos;

			public Long getAngle() {
				return this.angle;
			}

			public void setAngle(Long angle) {
				this.angle = angle;
			}

			public Long getWidth() {
				return this.width;
			}

			public void setWidth(Long width) {
				this.width = width;
			}

			public Long getHeight() {
				return this.height;
			}

			public void setHeight(Long height) {
				this.height = height;
			}

			public Long getOrgWidth() {
				return this.orgWidth;
			}

			public void setOrgWidth(Long orgWidth) {
				this.orgWidth = orgWidth;
			}

			public Long getOrgHeight() {
				return this.orgHeight;
			}

			public void setOrgHeight(Long orgHeight) {
				this.orgHeight = orgHeight;
			}

			public Long getBoxesCount() {
				return this.boxesCount;
			}

			public void setBoxesCount(Long boxesCount) {
				this.boxesCount = boxesCount;
			}

			public List<BoundingBoxesItem> getBoundingBoxes() {
				return this.boundingBoxes;
			}

			public void setBoundingBoxes(List<BoundingBoxesItem> boundingBoxes) {
				this.boundingBoxes = boundingBoxes;
			}

			public List<TableInfosItem> getTableInfos() {
				return this.tableInfos;
			}

			public void setTableInfos(List<TableInfosItem> tableInfos) {
				this.tableInfos = tableInfos;
			}

			public static class BoundingBoxesItem {

				private Float confidence;

				private String text;

				private Long direction;

				private Long tableId;

				private Long tableCellId;

				private Map<Object,Object> translation;

				private UpLeft upLeft;

				private UpRight upRight;

				private DownLeft downLeft;

				private DownRight downRight;

				public Float getConfidence() {
					return this.confidence;
				}

				public void setConfidence(Float confidence) {
					this.confidence = confidence;
				}

				public String getText() {
					return this.text;
				}

				public void setText(String text) {
					this.text = text;
				}

				public Long getDirection() {
					return this.direction;
				}

				public void setDirection(Long direction) {
					this.direction = direction;
				}

				public Long getTableId() {
					return this.tableId;
				}

				public void setTableId(Long tableId) {
					this.tableId = tableId;
				}

				public Long getTableCellId() {
					return this.tableCellId;
				}

				public void setTableCellId(Long tableCellId) {
					this.tableCellId = tableCellId;
				}

				public Map<Object,Object> getTranslation() {
					return this.translation;
				}

				public void setTranslation(Map<Object,Object> translation) {
					this.translation = translation;
				}

				public UpLeft getUpLeft() {
					return this.upLeft;
				}

				public void setUpLeft(UpLeft upLeft) {
					this.upLeft = upLeft;
				}

				public UpRight getUpRight() {
					return this.upRight;
				}

				public void setUpRight(UpRight upRight) {
					this.upRight = upRight;
				}

				public DownLeft getDownLeft() {
					return this.downLeft;
				}

				public void setDownLeft(DownLeft downLeft) {
					this.downLeft = downLeft;
				}

				public DownRight getDownRight() {
					return this.downRight;
				}

				public void setDownRight(DownRight downRight) {
					this.downRight = downRight;
				}

				public static class UpLeft {

					private Long x;

					private Long y;

					public Long getX() {
						return this.x;
					}

					public void setX(Long x) {
						this.x = x;
					}

					public Long getY() {
						return this.y;
					}

					public void setY(Long y) {
						this.y = y;
					}
				}

				public static class UpRight {

					private Long x;

					private Long y;

					public Long getX() {
						return this.x;
					}

					public void setX(Long x) {
						this.x = x;
					}

					public Long getY() {
						return this.y;
					}

					public void setY(Long y) {
						this.y = y;
					}
				}

				public static class DownLeft {

					private Long x;

					private Long y;

					public Long getX() {
						return this.x;
					}

					public void setX(Long x) {
						this.x = x;
					}

					public Long getY() {
						return this.y;
					}

					public void setY(Long y) {
						this.y = y;
					}
				}

				public static class DownRight {

					private Long x;

					private Long y;

					public Long getX() {
						return this.x;
					}

					public void setX(Long x) {
						this.x = x;
					}

					public Long getY() {
						return this.y;
					}

					public void setY(Long y) {
						this.y = y;
					}
				}
			}

			public static class TableInfosItem {

				private Long tableId;

				private Long xCellSize;

				private Long yCellSize;

				private List<CellInfosItem> cellInfos;

				public Long getTableId() {
					return this.tableId;
				}

				public void setTableId(Long tableId) {
					this.tableId = tableId;
				}

				public Long getXCellSize() {
					return this.xCellSize;
				}

				public void setXCellSize(Long xCellSize) {
					this.xCellSize = xCellSize;
				}

				public Long getYCellSize() {
					return this.yCellSize;
				}

				public void setYCellSize(Long yCellSize) {
					this.yCellSize = yCellSize;
				}

				public List<CellInfosItem> getCellInfos() {
					return this.cellInfos;
				}

				public void setCellInfos(List<CellInfosItem> cellInfos) {
					this.cellInfos = cellInfos;
				}

				public static class CellInfosItem {

					private Long tableCellId;

					private String text;

					private Long xsc;

					private Long xec;

					private Long ysc;

					private Long yec;

					private List<PosItem> pos;

					public Long getTableCellId() {
						return this.tableCellId;
					}

					public void setTableCellId(Long tableCellId) {
						this.tableCellId = tableCellId;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}

					public Long getXsc() {
						return this.xsc;
					}

					public void setXsc(Long xsc) {
						this.xsc = xsc;
					}

					public Long getXec() {
						return this.xec;
					}

					public void setXec(Long xec) {
						this.xec = xec;
					}

					public Long getYsc() {
						return this.ysc;
					}

					public void setYsc(Long ysc) {
						this.ysc = ysc;
					}

					public Long getYec() {
						return this.yec;
					}

					public void setYec(Long yec) {
						this.yec = yec;
					}

					public List<PosItem> getPos() {
						return this.pos;
					}

					public void setPos(List<PosItem> pos) {
						this.pos = pos;
					}

					public static class PosItem {

						private Long x;

						private Long y;

						public Long getX() {
							return this.x;
						}

						public void setX(Long x) {
							this.x = x;
						}

						public Long getY() {
							return this.y;
						}

						public void setY(Long y) {
							this.y = y;
						}
					}
				}
			}
		}
	}

	@Override
	public GetImageTranslateTaskResponse getInstance(UnmarshallerContext context) {
		return	GetImageTranslateTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
