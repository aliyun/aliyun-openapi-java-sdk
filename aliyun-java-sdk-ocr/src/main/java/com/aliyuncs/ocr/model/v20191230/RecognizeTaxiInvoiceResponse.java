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
import com.aliyuncs.ocr.transform.v20191230.RecognizeTaxiInvoiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeTaxiInvoiceResponse extends AcsResponse {

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

		private List<Invoice> invoices;

		public List<Invoice> getInvoices() {
			return this.invoices;
		}

		public void setInvoices(List<Invoice> invoices) {
			this.invoices = invoices;
		}

		public static class Invoice {

			private Integer rotateType;

			private List<Item> items;

			private InvoiceRoi invoiceRoi;

			public Integer getRotateType() {
				return this.rotateType;
			}

			public void setRotateType(Integer rotateType) {
				this.rotateType = rotateType;
			}

			public List<Item> getItems() {
				return this.items;
			}

			public void setItems(List<Item> items) {
				this.items = items;
			}

			public InvoiceRoi getInvoiceRoi() {
				return this.invoiceRoi;
			}

			public void setInvoiceRoi(InvoiceRoi invoiceRoi) {
				this.invoiceRoi = invoiceRoi;
			}

			public static class Item {

				private String text;

				private ItemRoi itemRoi;

				public String getText() {
					return this.text;
				}

				public void setText(String text) {
					this.text = text;
				}

				public ItemRoi getItemRoi() {
					return this.itemRoi;
				}

				public void setItemRoi(ItemRoi itemRoi) {
					this.itemRoi = itemRoi;
				}

				public static class ItemRoi {

					private Float angle;

					private Center center;

					private Size size;

					public Float getAngle() {
						return this.angle;
					}

					public void setAngle(Float angle) {
						this.angle = angle;
					}

					public Center getCenter() {
						return this.center;
					}

					public void setCenter(Center center) {
						this.center = center;
					}

					public Size getSize() {
						return this.size;
					}

					public void setSize(Size size) {
						this.size = size;
					}

					public static class Center {

						private Float x;

						private Float y;

						public Float getX() {
							return this.x;
						}

						public void setX(Float x) {
							this.x = x;
						}

						public Float getY() {
							return this.y;
						}

						public void setY(Float y) {
							this.y = y;
						}
					}

					public static class Size {

						private Float h;

						private Float w;

						public Float getH() {
							return this.h;
						}

						public void setH(Float h) {
							this.h = h;
						}

						public Float getW() {
							return this.w;
						}

						public void setW(Float w) {
							this.w = w;
						}
					}
				}
			}

			public static class InvoiceRoi {

				private Float h;

				private Float w;

				private Float x;

				private Float y;

				public Float getH() {
					return this.h;
				}

				public void setH(Float h) {
					this.h = h;
				}

				public Float getW() {
					return this.w;
				}

				public void setW(Float w) {
					this.w = w;
				}

				public Float getX() {
					return this.x;
				}

				public void setX(Float x) {
					this.x = x;
				}

				public Float getY() {
					return this.y;
				}

				public void setY(Float y) {
					this.y = y;
				}
			}
		}
	}

	@Override
	public RecognizeTaxiInvoiceResponse getInstance(UnmarshallerContext context) {
		return	RecognizeTaxiInvoiceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
