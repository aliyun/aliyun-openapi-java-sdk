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

package com.aliyuncs.linkedmall.model.v20180116;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.QueryMovieSeatsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMovieSeatsResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String subCode;

	private String subMessage;

	private String logsId;

	private Boolean success;

	private SeatMap seatMap;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public String getSubCode() {
		return this.subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getSubMessage() {
		return this.subMessage;
	}

	public void setSubMessage(String subMessage) {
		this.subMessage = subMessage;
	}

	public String getLogsId() {
		return this.logsId;
	}

	public void setLogsId(String logsId) {
		this.logsId = logsId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public SeatMap getSeatMap() {
		return this.seatMap;
	}

	public void setSeatMap(SeatMap seatMap) {
		this.seatMap = seatMap;
	}

	public static class SeatMap {

		private Long maxCanBuy;

		private Long maxColumn;

		private Long maxLeftPx;

		private Long maxRow;

		private Long maxTopPx;

		private Long minColumn;

		private Long minLeftPx;

		private Long minRow;

		private Long minTopPx;

		private String notice;

		private Boolean regular;

		private Long seatCount;

		private Long soldCount;

		private String tipMessage;

		private List<Seat> seats;

		public Long getMaxCanBuy() {
			return this.maxCanBuy;
		}

		public void setMaxCanBuy(Long maxCanBuy) {
			this.maxCanBuy = maxCanBuy;
		}

		public Long getMaxColumn() {
			return this.maxColumn;
		}

		public void setMaxColumn(Long maxColumn) {
			this.maxColumn = maxColumn;
		}

		public Long getMaxLeftPx() {
			return this.maxLeftPx;
		}

		public void setMaxLeftPx(Long maxLeftPx) {
			this.maxLeftPx = maxLeftPx;
		}

		public Long getMaxRow() {
			return this.maxRow;
		}

		public void setMaxRow(Long maxRow) {
			this.maxRow = maxRow;
		}

		public Long getMaxTopPx() {
			return this.maxTopPx;
		}

		public void setMaxTopPx(Long maxTopPx) {
			this.maxTopPx = maxTopPx;
		}

		public Long getMinColumn() {
			return this.minColumn;
		}

		public void setMinColumn(Long minColumn) {
			this.minColumn = minColumn;
		}

		public Long getMinLeftPx() {
			return this.minLeftPx;
		}

		public void setMinLeftPx(Long minLeftPx) {
			this.minLeftPx = minLeftPx;
		}

		public Long getMinRow() {
			return this.minRow;
		}

		public void setMinRow(Long minRow) {
			this.minRow = minRow;
		}

		public Long getMinTopPx() {
			return this.minTopPx;
		}

		public void setMinTopPx(Long minTopPx) {
			this.minTopPx = minTopPx;
		}

		public String getNotice() {
			return this.notice;
		}

		public void setNotice(String notice) {
			this.notice = notice;
		}

		public Boolean getRegular() {
			return this.regular;
		}

		public void setRegular(Boolean regular) {
			this.regular = regular;
		}

		public Long getSeatCount() {
			return this.seatCount;
		}

		public void setSeatCount(Long seatCount) {
			this.seatCount = seatCount;
		}

		public Long getSoldCount() {
			return this.soldCount;
		}

		public void setSoldCount(Long soldCount) {
			this.soldCount = soldCount;
		}

		public String getTipMessage() {
			return this.tipMessage;
		}

		public void setTipMessage(String tipMessage) {
			this.tipMessage = tipMessage;
		}

		public List<Seat> getSeats() {
			return this.seats;
		}

		public void setSeats(List<Seat> seats) {
			this.seats = seats;
		}

		public static class Seat {

			private String area;

			private Long column;

			private String extId;

			private Long flag;

			private Long leftPx;

			private String name;

			private Long row;

			private String rowName;

			private Long status;

			private Long topPx;

			public String getArea() {
				return this.area;
			}

			public void setArea(String area) {
				this.area = area;
			}

			public Long getColumn() {
				return this.column;
			}

			public void setColumn(Long column) {
				this.column = column;
			}

			public String getExtId() {
				return this.extId;
			}

			public void setExtId(String extId) {
				this.extId = extId;
			}

			public Long getFlag() {
				return this.flag;
			}

			public void setFlag(Long flag) {
				this.flag = flag;
			}

			public Long getLeftPx() {
				return this.leftPx;
			}

			public void setLeftPx(Long leftPx) {
				this.leftPx = leftPx;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Long getRow() {
				return this.row;
			}

			public void setRow(Long row) {
				this.row = row;
			}

			public String getRowName() {
				return this.rowName;
			}

			public void setRowName(String rowName) {
				this.rowName = rowName;
			}

			public Long getStatus() {
				return this.status;
			}

			public void setStatus(Long status) {
				this.status = status;
			}

			public Long getTopPx() {
				return this.topPx;
			}

			public void setTopPx(Long topPx) {
				this.topPx = topPx;
			}
		}
	}

	@Override
	public QueryMovieSeatsResponse getInstance(UnmarshallerContext context) {
		return	QueryMovieSeatsResponseUnmarshaller.unmarshall(this, context);
	}
}
