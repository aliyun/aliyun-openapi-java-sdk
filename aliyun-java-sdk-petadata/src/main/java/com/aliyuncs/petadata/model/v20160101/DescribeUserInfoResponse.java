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

package com.aliyuncs.petadata.model.v20160101;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.petadata.transform.v20160101.DescribeUserInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean isAuthentication;

	private Boolean isFinance;

	private Long balanceAmount;

	private AlreadyHasResourceNum alreadyHasResourceNum;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getIsAuthentication() {
		return this.isAuthentication;
	}

	public void setIsAuthentication(Boolean isAuthentication) {
		this.isAuthentication = isAuthentication;
	}

	public Boolean getIsFinance() {
		return this.isFinance;
	}

	public void setIsFinance(Boolean isFinance) {
		this.isFinance = isFinance;
	}

	public Long getBalanceAmount() {
		return this.balanceAmount;
	}

	public void setBalanceAmount(Long balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public AlreadyHasResourceNum getAlreadyHasResourceNum() {
		return this.alreadyHasResourceNum;
	}

	public void setAlreadyHasResourceNum(AlreadyHasResourceNum alreadyHasResourceNum) {
		this.alreadyHasResourceNum = alreadyHasResourceNum;
	}

	public static class AlreadyHasResourceNum {

		private Long ecsBought;

		private Long petaDataBought;

		public Long getEcsBought() {
			return this.ecsBought;
		}

		public void setEcsBought(Long ecsBought) {
			this.ecsBought = ecsBought;
		}

		public Long getPetaDataBought() {
			return this.petaDataBought;
		}

		public void setPetaDataBought(Long petaDataBought) {
			this.petaDataBought = petaDataBought;
		}
	}

	@Override
	public DescribeUserInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
