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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ocr.transform.v20191230.RecognizeTrainTicketResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeTrainTicketResponse extends AcsResponse {

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

		private String date;

		private String destination;

		private String level;

		private String number;

		private String name;

		private String departureStation;

		private String seat;

		private Float price;

		public String getDate() {
			return this.date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getDestination() {
			return this.destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public String getNumber() {
			return this.number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDepartureStation() {
			return this.departureStation;
		}

		public void setDepartureStation(String departureStation) {
			this.departureStation = departureStation;
		}

		public String getSeat() {
			return this.seat;
		}

		public void setSeat(String seat) {
			this.seat = seat;
		}

		public Float getPrice() {
			return this.price;
		}

		public void setPrice(Float price) {
			this.price = price;
		}
	}

	@Override
	public RecognizeTrainTicketResponse getInstance(UnmarshallerContext context) {
		return	RecognizeTrainTicketResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
