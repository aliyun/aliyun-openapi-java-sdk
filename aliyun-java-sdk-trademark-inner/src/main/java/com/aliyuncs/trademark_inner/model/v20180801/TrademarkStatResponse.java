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

package com.aliyuncs.trademark_inner.model.v20180801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark_inner.transform.v20180801.TrademarkStatResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TrademarkStatResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private List<TrademarkStatDTO> list;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<TrademarkStatDTO> getList() {
		return this.list;
	}

	public void setList(List<TrademarkStatDTO> list) {
		this.list = list;
	}

	public static class TrademarkStatDTO {

		private String code;

		private Integer num;

		private Integer type;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public Integer getNum() {
			return this.num;
		}

		public void setNum(Integer num) {
			this.num = num;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}
	}

	@Override
	public TrademarkStatResponse getInstance(UnmarshallerContext context) {
		return	TrademarkStatResponseUnmarshaller.unmarshall(this, context);
	}
}
