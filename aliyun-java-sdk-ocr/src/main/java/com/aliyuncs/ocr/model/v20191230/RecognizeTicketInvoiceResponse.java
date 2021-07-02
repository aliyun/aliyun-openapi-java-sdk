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

package com.aliyuncs.ocr.model.v20191230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ocr.transform.v20191230.RecognizeTicketInvoiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeTicketInvoiceResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long count;

		private Long height;

		private Long width;

		private Long orgHeight;

		private Long orgWidth;

		private List<ResultsItem> results;

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public Long getHeight() {
			return this.height;
		}

		public void setHeight(Long height) {
			this.height = height;
		}

		public Long getWidth() {
			return this.width;
		}

		public void setWidth(Long width) {
			this.width = width;
		}

		public Long getOrgHeight() {
			return this.orgHeight;
		}

		public void setOrgHeight(Long orgHeight) {
			this.orgHeight = orgHeight;
		}

		public Long getOrgWidth() {
			return this.orgWidth;
		}

		public void setOrgWidth(Long orgWidth) {
			this.orgWidth = orgWidth;
		}

		public List<ResultsItem> getResults() {
			return this.results;
		}

		public void setResults(List<ResultsItem> results) {
			this.results = results;
		}

		public static class ResultsItem {

			private Long index;

			private String type;

			private List<KeyValueInfosItem> keyValueInfos;

			private List<SliceRectangleItem> sliceRectangle;

			private Content content;

			public Long getIndex() {
				return this.index;
			}

			public void setIndex(Long index) {
				this.index = index;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public List<KeyValueInfosItem> getKeyValueInfos() {
				return this.keyValueInfos;
			}

			public void setKeyValueInfos(List<KeyValueInfosItem> keyValueInfos) {
				this.keyValueInfos = keyValueInfos;
			}

			public List<SliceRectangleItem> getSliceRectangle() {
				return this.sliceRectangle;
			}

			public void setSliceRectangle(List<SliceRectangleItem> sliceRectangle) {
				this.sliceRectangle = sliceRectangle;
			}

			public Content getContent() {
				return this.content;
			}

			public void setContent(Content content) {
				this.content = content;
			}

			public static class KeyValueInfosItem {

				private String key;

				private String value;

				private Float valueScore;

				private List<ValuePositionsItem> valuePositions;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public Float getValueScore() {
					return this.valueScore;
				}

				public void setValueScore(Float valueScore) {
					this.valueScore = valueScore;
				}

				public List<ValuePositionsItem> getValuePositions() {
					return this.valuePositions;
				}

				public void setValuePositions(List<ValuePositionsItem> valuePositions) {
					this.valuePositions = valuePositions;
				}

				public static class ValuePositionsItem {

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

			public static class SliceRectangleItem {

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

			public static class Content {

				private String invoiceCode;

				private String invoiceNumber;

				private String invoiceDate;

				private String antiFakeCode;

				private String payeeName;

				private String payeeRegisterNo;

				private String payerName;

				private String payerRegisterNo;

				private String sumAmount;

				public String getInvoiceCode() {
					return this.invoiceCode;
				}

				public void setInvoiceCode(String invoiceCode) {
					this.invoiceCode = invoiceCode;
				}

				public String getInvoiceNumber() {
					return this.invoiceNumber;
				}

				public void setInvoiceNumber(String invoiceNumber) {
					this.invoiceNumber = invoiceNumber;
				}

				public String getInvoiceDate() {
					return this.invoiceDate;
				}

				public void setInvoiceDate(String invoiceDate) {
					this.invoiceDate = invoiceDate;
				}

				public String getAntiFakeCode() {
					return this.antiFakeCode;
				}

				public void setAntiFakeCode(String antiFakeCode) {
					this.antiFakeCode = antiFakeCode;
				}

				public String getPayeeName() {
					return this.payeeName;
				}

				public void setPayeeName(String payeeName) {
					this.payeeName = payeeName;
				}

				public String getPayeeRegisterNo() {
					return this.payeeRegisterNo;
				}

				public void setPayeeRegisterNo(String payeeRegisterNo) {
					this.payeeRegisterNo = payeeRegisterNo;
				}

				public String getPayerName() {
					return this.payerName;
				}

				public void setPayerName(String payerName) {
					this.payerName = payerName;
				}

				public String getPayerRegisterNo() {
					return this.payerRegisterNo;
				}

				public void setPayerRegisterNo(String payerRegisterNo) {
					this.payerRegisterNo = payerRegisterNo;
				}

				public String getSumAmount() {
					return this.sumAmount;
				}

				public void setSumAmount(String sumAmount) {
					this.sumAmount = sumAmount;
				}
			}
		}
	}

	@Override
	public RecognizeTicketInvoiceResponse getInstance(UnmarshallerContext context) {
		return	RecognizeTicketInvoiceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
