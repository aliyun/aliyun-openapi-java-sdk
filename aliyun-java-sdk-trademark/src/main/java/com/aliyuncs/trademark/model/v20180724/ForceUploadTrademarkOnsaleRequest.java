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

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ForceUploadTrademarkOnsaleRequest extends RpcAcsRequest<ForceUploadTrademarkOnsaleResponse> {
	   

	private Long regAnnDate;

	private String reason;

	private String classificationCode;

	private String description;

	private String ownerEnName;

	private String type;

	private String tmIcon;

	private String thirdClassification;

	private String tmName;

	private String ownerName;

	private Float originalPrice;

	private Long endTime;

	private String tmNumber;

	private Long beginTime;

	private String label;

	private String secondaryClassification;
	public ForceUploadTrademarkOnsaleRequest() {
		super("Trademark", "2018-07-24", "ForceUploadTrademarkOnsale");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getRegAnnDate() {
		return this.regAnnDate;
	}

	public void setRegAnnDate(Long regAnnDate) {
		this.regAnnDate = regAnnDate;
		if(regAnnDate != null){
			putQueryParameter("RegAnnDate", regAnnDate.toString());
		}
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
		if(reason != null){
			putQueryParameter("Reason", reason);
		}
	}

	public String getClassificationCode() {
		return this.classificationCode;
	}

	public void setClassificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
		if(classificationCode != null){
			putQueryParameter("ClassificationCode", classificationCode);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getOwnerEnName() {
		return this.ownerEnName;
	}

	public void setOwnerEnName(String ownerEnName) {
		this.ownerEnName = ownerEnName;
		if(ownerEnName != null){
			putQueryParameter("OwnerEnName", ownerEnName);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getTmIcon() {
		return this.tmIcon;
	}

	public void setTmIcon(String tmIcon) {
		this.tmIcon = tmIcon;
		if(tmIcon != null){
			putQueryParameter("TmIcon", tmIcon);
		}
	}

	public String getThirdClassification() {
		return this.thirdClassification;
	}

	public void setThirdClassification(String thirdClassification) {
		this.thirdClassification = thirdClassification;
		if(thirdClassification != null){
			putQueryParameter("ThirdClassification", thirdClassification);
		}
	}

	public String getTmName() {
		return this.tmName;
	}

	public void setTmName(String tmName) {
		this.tmName = tmName;
		if(tmName != null){
			putQueryParameter("TmName", tmName);
		}
	}

	public String getOwnerName() {
		return this.ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
		if(ownerName != null){
			putQueryParameter("OwnerName", ownerName);
		}
	}

	public Float getOriginalPrice() {
		return this.originalPrice;
	}

	public void setOriginalPrice(Float originalPrice) {
		this.originalPrice = originalPrice;
		if(originalPrice != null){
			putQueryParameter("OriginalPrice", originalPrice.toString());
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public String getTmNumber() {
		return this.tmNumber;
	}

	public void setTmNumber(String tmNumber) {
		this.tmNumber = tmNumber;
		if(tmNumber != null){
			putQueryParameter("TmNumber", tmNumber);
		}
	}

	public Long getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Long beginTime) {
		this.beginTime = beginTime;
		if(beginTime != null){
			putQueryParameter("BeginTime", beginTime.toString());
		}
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
		if(label != null){
			putQueryParameter("Label", label);
		}
	}

	public String getSecondaryClassification() {
		return this.secondaryClassification;
	}

	public void setSecondaryClassification(String secondaryClassification) {
		this.secondaryClassification = secondaryClassification;
		if(secondaryClassification != null){
			putQueryParameter("SecondaryClassification", secondaryClassification);
		}
	}

	@Override
	public Class<ForceUploadTrademarkOnsaleResponse> getResponseClass() {
		return ForceUploadTrademarkOnsaleResponse.class;
	}

}
