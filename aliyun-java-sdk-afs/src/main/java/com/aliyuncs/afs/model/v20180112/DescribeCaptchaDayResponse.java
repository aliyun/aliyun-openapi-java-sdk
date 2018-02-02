/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.afs.model.v20180112;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.afs.transform.v20180112.DescribeCaptchaDayResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCaptchaDayResponse extends AcsResponse {

	private String requestId;

	private String bizCode;

	private Boolean hasData;

	private CaptchaDay captchaDay;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public Boolean getHasData() {
		return this.hasData;
	}

	public void setHasData(Boolean hasData) {
		this.hasData = hasData;
	}

	public CaptchaDay getCaptchaDay() {
		return this.captchaDay;
	}

	public void setCaptchaDay(CaptchaDay captchaDay) {
		this.captchaDay = captchaDay;
	}

	public static class CaptchaDay {

		private Integer init;

		private Integer askForVerify;

		private Integer direcetStrategyInterception;

		private Integer twiceVerify;

		private Integer pass;

		private Integer checkTested;

		private Integer uncheckTested;

		private Integer legalSign;

		private Integer maliciousFlow;

		public Integer getInit() {
			return this.init;
		}

		public void setInit(Integer init) {
			this.init = init;
		}

		public Integer getAskForVerify() {
			return this.askForVerify;
		}

		public void setAskForVerify(Integer askForVerify) {
			this.askForVerify = askForVerify;
		}

		public Integer getDirecetStrategyInterception() {
			return this.direcetStrategyInterception;
		}

		public void setDirecetStrategyInterception(Integer direcetStrategyInterception) {
			this.direcetStrategyInterception = direcetStrategyInterception;
		}

		public Integer getTwiceVerify() {
			return this.twiceVerify;
		}

		public void setTwiceVerify(Integer twiceVerify) {
			this.twiceVerify = twiceVerify;
		}

		public Integer getPass() {
			return this.pass;
		}

		public void setPass(Integer pass) {
			this.pass = pass;
		}

		public Integer getCheckTested() {
			return this.checkTested;
		}

		public void setCheckTested(Integer checkTested) {
			this.checkTested = checkTested;
		}

		public Integer getUncheckTested() {
			return this.uncheckTested;
		}

		public void setUncheckTested(Integer uncheckTested) {
			this.uncheckTested = uncheckTested;
		}

		public Integer getLegalSign() {
			return this.legalSign;
		}

		public void setLegalSign(Integer legalSign) {
			this.legalSign = legalSign;
		}

		public Integer getMaliciousFlow() {
			return this.maliciousFlow;
		}

		public void setMaliciousFlow(Integer maliciousFlow) {
			this.maliciousFlow = maliciousFlow;
		}
	}

	@Override
	public DescribeCaptchaDayResponse getInstance(UnmarshallerContext context) {
		return	DescribeCaptchaDayResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
