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

package com.aliyuncs.gts_smart_call.model.v20201021;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.gts_smart_call.transform.v20201021.InteractVoiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InteractVoiceResponse extends AcsResponse {

	private String requestId;

	private String callId;

	private String action;

	private Boolean actionBreak;

	private String actionCode;

	private Boolean actionCodeBreak;

	private Integer muteTime;

	private String dynamicId;

	private String actionCodeParam;

	private String number;

	private Integer actionCodeTimeBreak;

	private Integer dtmfNoninOvertime;

	private Integer dtmfMaxNumbers;

	private String dtmfEndCharacter;

	private String transferPlayfile;

	private Boolean isMonitor;

	private String ccName;

	private String errorMessage;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCallId() {
		return this.callId;
	}

	public void setCallId(String callId) {
		this.callId = callId;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Boolean getActionBreak() {
		return this.actionBreak;
	}

	public void setActionBreak(Boolean actionBreak) {
		this.actionBreak = actionBreak;
	}

	public String getActionCode() {
		return this.actionCode;
	}

	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	public Boolean getActionCodeBreak() {
		return this.actionCodeBreak;
	}

	public void setActionCodeBreak(Boolean actionCodeBreak) {
		this.actionCodeBreak = actionCodeBreak;
	}

	public Integer getMuteTime() {
		return this.muteTime;
	}

	public void setMuteTime(Integer muteTime) {
		this.muteTime = muteTime;
	}

	public String getDynamicId() {
		return this.dynamicId;
	}

	public void setDynamicId(String dynamicId) {
		this.dynamicId = dynamicId;
	}

	public String getActionCodeParam() {
		return this.actionCodeParam;
	}

	public void setActionCodeParam(String actionCodeParam) {
		this.actionCodeParam = actionCodeParam;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Integer getActionCodeTimeBreak() {
		return this.actionCodeTimeBreak;
	}

	public void setActionCodeTimeBreak(Integer actionCodeTimeBreak) {
		this.actionCodeTimeBreak = actionCodeTimeBreak;
	}

	public Integer getDtmfNoninOvertime() {
		return this.dtmfNoninOvertime;
	}

	public void setDtmfNoninOvertime(Integer dtmfNoninOvertime) {
		this.dtmfNoninOvertime = dtmfNoninOvertime;
	}

	public Integer getDtmfMaxNumbers() {
		return this.dtmfMaxNumbers;
	}

	public void setDtmfMaxNumbers(Integer dtmfMaxNumbers) {
		this.dtmfMaxNumbers = dtmfMaxNumbers;
	}

	public String getDtmfEndCharacter() {
		return this.dtmfEndCharacter;
	}

	public void setDtmfEndCharacter(String dtmfEndCharacter) {
		this.dtmfEndCharacter = dtmfEndCharacter;
	}

	public String getTransferPlayfile() {
		return this.transferPlayfile;
	}

	public void setTransferPlayfile(String transferPlayfile) {
		this.transferPlayfile = transferPlayfile;
	}

	public Boolean getIsMonitor() {
		return this.isMonitor;
	}

	public void setIsMonitor(Boolean isMonitor) {
		this.isMonitor = isMonitor;
	}

	public String getCcName() {
		return this.ccName;
	}

	public void setCcName(String ccName) {
		this.ccName = ccName;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public InteractVoiceResponse getInstance(UnmarshallerContext context) {
		return	InteractVoiceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
