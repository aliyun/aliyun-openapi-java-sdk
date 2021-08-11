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

package com.aliyuncs.ddoscoo.model.v20200101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeDomainStatusCodeCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainStatusCodeCountResponse extends AcsResponse {

	private String requestId;

	private Long status2XX;

	private Long status501;

	private Long status502;

	private Long status503;

	private Long status504;

	private Long status200;

	private Long status405;

	private Long status5XX;

	private Long status4XX;

	private Long status403;

	private Long status404;

	private Long status3XX;

	private Long status2XX1;

	private Long status5012;

	private Long status5023;

	private Long status5034;

	private Long status5045;

	private Long status2006;

	private Long status4057;

	private Long status5XX8;

	private Long status4XX9;

	private Long status40310;

	private Long status40411;

	private Long status3XX12;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getStatus2XX() {
		return this.status2XX;
	}

	public void setStatus2XX(Long status2XX) {
		this.status2XX = status2XX;
	}

	public Long getStatus501() {
		return this.status501;
	}

	public void setStatus501(Long status501) {
		this.status501 = status501;
	}

	public Long getStatus502() {
		return this.status502;
	}

	public void setStatus502(Long status502) {
		this.status502 = status502;
	}

	public Long getStatus503() {
		return this.status503;
	}

	public void setStatus503(Long status503) {
		this.status503 = status503;
	}

	public Long getStatus504() {
		return this.status504;
	}

	public void setStatus504(Long status504) {
		this.status504 = status504;
	}

	public Long getStatus200() {
		return this.status200;
	}

	public void setStatus200(Long status200) {
		this.status200 = status200;
	}

	public Long getStatus405() {
		return this.status405;
	}

	public void setStatus405(Long status405) {
		this.status405 = status405;
	}

	public Long getStatus5XX() {
		return this.status5XX;
	}

	public void setStatus5XX(Long status5XX) {
		this.status5XX = status5XX;
	}

	public Long getStatus4XX() {
		return this.status4XX;
	}

	public void setStatus4XX(Long status4XX) {
		this.status4XX = status4XX;
	}

	public Long getStatus403() {
		return this.status403;
	}

	public void setStatus403(Long status403) {
		this.status403 = status403;
	}

	public Long getStatus404() {
		return this.status404;
	}

	public void setStatus404(Long status404) {
		this.status404 = status404;
	}

	public Long getStatus3XX() {
		return this.status3XX;
	}

	public void setStatus3XX(Long status3XX) {
		this.status3XX = status3XX;
	}

	public Long getStatus2XX1() {
		return this.status2XX1;
	}

	public void setStatus2XX1(Long status2XX1) {
		this.status2XX1 = status2XX1;
	}

	public Long getStatus5012() {
		return this.status5012;
	}

	public void setStatus5012(Long status5012) {
		this.status5012 = status5012;
	}

	public Long getStatus5023() {
		return this.status5023;
	}

	public void setStatus5023(Long status5023) {
		this.status5023 = status5023;
	}

	public Long getStatus5034() {
		return this.status5034;
	}

	public void setStatus5034(Long status5034) {
		this.status5034 = status5034;
	}

	public Long getStatus5045() {
		return this.status5045;
	}

	public void setStatus5045(Long status5045) {
		this.status5045 = status5045;
	}

	public Long getStatus2006() {
		return this.status2006;
	}

	public void setStatus2006(Long status2006) {
		this.status2006 = status2006;
	}

	public Long getStatus4057() {
		return this.status4057;
	}

	public void setStatus4057(Long status4057) {
		this.status4057 = status4057;
	}

	public Long getStatus5XX8() {
		return this.status5XX8;
	}

	public void setStatus5XX8(Long status5XX8) {
		this.status5XX8 = status5XX8;
	}

	public Long getStatus4XX9() {
		return this.status4XX9;
	}

	public void setStatus4XX9(Long status4XX9) {
		this.status4XX9 = status4XX9;
	}

	public Long getStatus40310() {
		return this.status40310;
	}

	public void setStatus40310(Long status40310) {
		this.status40310 = status40310;
	}

	public Long getStatus40411() {
		return this.status40411;
	}

	public void setStatus40411(Long status40411) {
		this.status40411 = status40411;
	}

	public Long getStatus3XX12() {
		return this.status3XX12;
	}

	public void setStatus3XX12(Long status3XX12) {
		this.status3XX12 = status3XX12;
	}

	@Override
	public DescribeDomainStatusCodeCountResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainStatusCodeCountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
