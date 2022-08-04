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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20180724.GetNotaryOrderResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetNotaryOrderResponse extends AcsResponse {

	private String type;

	private Float orderPrice;

	private String legalPersonIdCard;

	private String businessLicenseId;

	private String notaryPostReceipt;

	private String companyContactName;

	private Integer notaryStatus;

	private String sellerBackOfIdCard;

	private String tmRegisterChangeCertificate;

	private String requestId;

	private String legalPersonName;

	private String tmImage;

	private Long notaryAcceptDate;

	private String errorCode;

	private String aliyunOrderId;

	private Long notarySucceedDate;

	private Integer applyPostStatus;

	private String errorMsg;

	private String name;

	private String businessLicense;

	private String receiverName;

	private Long orderDate;

	private String companyContactPhone;

	private Integer notaryType;

	private Long notaryFailedDate;

	private String tmClassification;

	private Boolean success;

	private String bizId;

	private Long notaryOrderId;

	private String phone;

	private String receiverPhone;

	private String tmRegisterCertificate;

	private String tmName;

	private String tmRegisterNo;

	private String sellerCompanyName;

	private String tmAcceptCertificate;

	private String receiverPostalCode;

	private String notaryCertificate;

	private String legalPersonPhone;

	private String notaryFailedReason;

	private String sellerFrontOfIdCard;

	private String receiverAddress;

	private String notaryPlatformName;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Float getOrderPrice() {
		return this.orderPrice;
	}

	public void setOrderPrice(Float orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getLegalPersonIdCard() {
		return this.legalPersonIdCard;
	}

	public void setLegalPersonIdCard(String legalPersonIdCard) {
		this.legalPersonIdCard = legalPersonIdCard;
	}

	public String getBusinessLicenseId() {
		return this.businessLicenseId;
	}

	public void setBusinessLicenseId(String businessLicenseId) {
		this.businessLicenseId = businessLicenseId;
	}

	public String getNotaryPostReceipt() {
		return this.notaryPostReceipt;
	}

	public void setNotaryPostReceipt(String notaryPostReceipt) {
		this.notaryPostReceipt = notaryPostReceipt;
	}

	public String getCompanyContactName() {
		return this.companyContactName;
	}

	public void setCompanyContactName(String companyContactName) {
		this.companyContactName = companyContactName;
	}

	public Integer getNotaryStatus() {
		return this.notaryStatus;
	}

	public void setNotaryStatus(Integer notaryStatus) {
		this.notaryStatus = notaryStatus;
	}

	public String getSellerBackOfIdCard() {
		return this.sellerBackOfIdCard;
	}

	public void setSellerBackOfIdCard(String sellerBackOfIdCard) {
		this.sellerBackOfIdCard = sellerBackOfIdCard;
	}

	public String getTmRegisterChangeCertificate() {
		return this.tmRegisterChangeCertificate;
	}

	public void setTmRegisterChangeCertificate(String tmRegisterChangeCertificate) {
		this.tmRegisterChangeCertificate = tmRegisterChangeCertificate;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLegalPersonName() {
		return this.legalPersonName;
	}

	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
	}

	public String getTmImage() {
		return this.tmImage;
	}

	public void setTmImage(String tmImage) {
		this.tmImage = tmImage;
	}

	public Long getNotaryAcceptDate() {
		return this.notaryAcceptDate;
	}

	public void setNotaryAcceptDate(Long notaryAcceptDate) {
		this.notaryAcceptDate = notaryAcceptDate;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getAliyunOrderId() {
		return this.aliyunOrderId;
	}

	public void setAliyunOrderId(String aliyunOrderId) {
		this.aliyunOrderId = aliyunOrderId;
	}

	public Long getNotarySucceedDate() {
		return this.notarySucceedDate;
	}

	public void setNotarySucceedDate(Long notarySucceedDate) {
		this.notarySucceedDate = notarySucceedDate;
	}

	public Integer getApplyPostStatus() {
		return this.applyPostStatus;
	}

	public void setApplyPostStatus(Integer applyPostStatus) {
		this.applyPostStatus = applyPostStatus;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBusinessLicense() {
		return this.businessLicense;
	}

	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}

	public String getReceiverName() {
		return this.receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public Long getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Long orderDate) {
		this.orderDate = orderDate;
	}

	public String getCompanyContactPhone() {
		return this.companyContactPhone;
	}

	public void setCompanyContactPhone(String companyContactPhone) {
		this.companyContactPhone = companyContactPhone;
	}

	public Integer getNotaryType() {
		return this.notaryType;
	}

	public void setNotaryType(Integer notaryType) {
		this.notaryType = notaryType;
	}

	public Long getNotaryFailedDate() {
		return this.notaryFailedDate;
	}

	public void setNotaryFailedDate(Long notaryFailedDate) {
		this.notaryFailedDate = notaryFailedDate;
	}

	public String getTmClassification() {
		return this.tmClassification;
	}

	public void setTmClassification(String tmClassification) {
		this.tmClassification = tmClassification;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public Long getNotaryOrderId() {
		return this.notaryOrderId;
	}

	public void setNotaryOrderId(Long notaryOrderId) {
		this.notaryOrderId = notaryOrderId;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getReceiverPhone() {
		return this.receiverPhone;
	}

	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getTmRegisterCertificate() {
		return this.tmRegisterCertificate;
	}

	public void setTmRegisterCertificate(String tmRegisterCertificate) {
		this.tmRegisterCertificate = tmRegisterCertificate;
	}

	public String getTmName() {
		return this.tmName;
	}

	public void setTmName(String tmName) {
		this.tmName = tmName;
	}

	public String getTmRegisterNo() {
		return this.tmRegisterNo;
	}

	public void setTmRegisterNo(String tmRegisterNo) {
		this.tmRegisterNo = tmRegisterNo;
	}

	public String getSellerCompanyName() {
		return this.sellerCompanyName;
	}

	public void setSellerCompanyName(String sellerCompanyName) {
		this.sellerCompanyName = sellerCompanyName;
	}

	public String getTmAcceptCertificate() {
		return this.tmAcceptCertificate;
	}

	public void setTmAcceptCertificate(String tmAcceptCertificate) {
		this.tmAcceptCertificate = tmAcceptCertificate;
	}

	public String getReceiverPostalCode() {
		return this.receiverPostalCode;
	}

	public void setReceiverPostalCode(String receiverPostalCode) {
		this.receiverPostalCode = receiverPostalCode;
	}

	public String getNotaryCertificate() {
		return this.notaryCertificate;
	}

	public void setNotaryCertificate(String notaryCertificate) {
		this.notaryCertificate = notaryCertificate;
	}

	public String getLegalPersonPhone() {
		return this.legalPersonPhone;
	}

	public void setLegalPersonPhone(String legalPersonPhone) {
		this.legalPersonPhone = legalPersonPhone;
	}

	public String getNotaryFailedReason() {
		return this.notaryFailedReason;
	}

	public void setNotaryFailedReason(String notaryFailedReason) {
		this.notaryFailedReason = notaryFailedReason;
	}

	public String getSellerFrontOfIdCard() {
		return this.sellerFrontOfIdCard;
	}

	public void setSellerFrontOfIdCard(String sellerFrontOfIdCard) {
		this.sellerFrontOfIdCard = sellerFrontOfIdCard;
	}

	public String getReceiverAddress() {
		return this.receiverAddress;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getNotaryPlatformName() {
		return this.notaryPlatformName;
	}

	public void setNotaryPlatformName(String notaryPlatformName) {
		this.notaryPlatformName = notaryPlatformName;
	}

	@Override
	public GetNotaryOrderResponse getInstance(UnmarshallerContext context) {
		return	GetNotaryOrderResponseUnmarshaller.unmarshall(this, context);
	}
}
