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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribePriceRequest extends RpcAcsRequest<DescribePriceResponse> {
	   

	private String eduTeacherBundleId;

	private String spPeriodInfo;

	private String rootDiskPerformanceLevel;

	private String spType;

	private Integer groupDesktopCount;

	private String networkType;

	private String userDiskPerformanceLevel;

	private String eduRoomClassify;

	private Integer eduDesktopNum;

	private String eduCdsEnable;

	private String instanceType;

	private List<BundleModels> bundleModelss;

	private Integer eduTeacherNum;

	private Integer period;

	private Integer amount;

	private String hardwareVersion;

	private Integer bandwidth;

	private Integer eduCommittedTime;

	private Boolean spPrice;

	private String eduDesktopBundleId;

	private String eduStudentBundleId;

	private String osType;

	private Integer eduCdsSize;

	private String resourceType;

	private String promotionId;

	private Integer userDiskSizeGib;

	private String periodUnit;

	private Integer eduStudentNum;

	private String internetChargeType;

	private Integer packageSize;

	private Integer rootDiskSizeGib;
	public DescribePriceRequest() {
		super("ecd", "2020-09-30", "DescribePrice", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEduTeacherBundleId() {
		return this.eduTeacherBundleId;
	}

	public void setEduTeacherBundleId(String eduTeacherBundleId) {
		this.eduTeacherBundleId = eduTeacherBundleId;
		if(eduTeacherBundleId != null){
			putQueryParameter("EduTeacherBundleId", eduTeacherBundleId);
		}
	}

	public String getSpPeriodInfo() {
		return this.spPeriodInfo;
	}

	public void setSpPeriodInfo(String spPeriodInfo) {
		this.spPeriodInfo = spPeriodInfo;
		if(spPeriodInfo != null){
			putQueryParameter("SpPeriodInfo", spPeriodInfo);
		}
	}

	public String getRootDiskPerformanceLevel() {
		return this.rootDiskPerformanceLevel;
	}

	public void setRootDiskPerformanceLevel(String rootDiskPerformanceLevel) {
		this.rootDiskPerformanceLevel = rootDiskPerformanceLevel;
		if(rootDiskPerformanceLevel != null){
			putQueryParameter("RootDiskPerformanceLevel", rootDiskPerformanceLevel);
		}
	}

	public String getSpType() {
		return this.spType;
	}

	public void setSpType(String spType) {
		this.spType = spType;
		if(spType != null){
			putQueryParameter("SpType", spType);
		}
	}

	public Integer getGroupDesktopCount() {
		return this.groupDesktopCount;
	}

	public void setGroupDesktopCount(Integer groupDesktopCount) {
		this.groupDesktopCount = groupDesktopCount;
		if(groupDesktopCount != null){
			putQueryParameter("GroupDesktopCount", groupDesktopCount.toString());
		}
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putQueryParameter("NetworkType", networkType);
		}
	}

	public String getUserDiskPerformanceLevel() {
		return this.userDiskPerformanceLevel;
	}

	public void setUserDiskPerformanceLevel(String userDiskPerformanceLevel) {
		this.userDiskPerformanceLevel = userDiskPerformanceLevel;
		if(userDiskPerformanceLevel != null){
			putQueryParameter("UserDiskPerformanceLevel", userDiskPerformanceLevel);
		}
	}

	public String getEduRoomClassify() {
		return this.eduRoomClassify;
	}

	public void setEduRoomClassify(String eduRoomClassify) {
		this.eduRoomClassify = eduRoomClassify;
		if(eduRoomClassify != null){
			putQueryParameter("EduRoomClassify", eduRoomClassify);
		}
	}

	public Integer getEduDesktopNum() {
		return this.eduDesktopNum;
	}

	public void setEduDesktopNum(Integer eduDesktopNum) {
		this.eduDesktopNum = eduDesktopNum;
		if(eduDesktopNum != null){
			putQueryParameter("EduDesktopNum", eduDesktopNum.toString());
		}
	}

	public String getEduCdsEnable() {
		return this.eduCdsEnable;
	}

	public void setEduCdsEnable(String eduCdsEnable) {
		this.eduCdsEnable = eduCdsEnable;
		if(eduCdsEnable != null){
			putQueryParameter("EduCdsEnable", eduCdsEnable);
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public List<BundleModels> getBundleModelss() {
		return this.bundleModelss;
	}

	public void setBundleModelss(List<BundleModels> bundleModelss) {
		this.bundleModelss = bundleModelss;	
		if (bundleModelss != null) {
			for (int depth1 = 0; depth1 < bundleModelss.size(); depth1++) {
				putQueryParameter("BundleModels." + (depth1 + 1) + ".Duration" , bundleModelss.get(depth1).getDuration());
				putQueryParameter("BundleModels." + (depth1 + 1) + ".Amount" , bundleModelss.get(depth1).getAmount());
				putQueryParameter("BundleModels." + (depth1 + 1) + ".BundleId" , bundleModelss.get(depth1).getBundleId());
			}
		}	
	}

	public Integer getEduTeacherNum() {
		return this.eduTeacherNum;
	}

	public void setEduTeacherNum(Integer eduTeacherNum) {
		this.eduTeacherNum = eduTeacherNum;
		if(eduTeacherNum != null){
			putQueryParameter("EduTeacherNum", eduTeacherNum.toString());
		}
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
		}
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
		if(amount != null){
			putQueryParameter("Amount", amount.toString());
		}
	}

	public String getHardwareVersion() {
		return this.hardwareVersion;
	}

	public void setHardwareVersion(String hardwareVersion) {
		this.hardwareVersion = hardwareVersion;
		if(hardwareVersion != null){
			putQueryParameter("HardwareVersion", hardwareVersion);
		}
	}

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
		if(bandwidth != null){
			putQueryParameter("Bandwidth", bandwidth.toString());
		}
	}

	public Integer getEduCommittedTime() {
		return this.eduCommittedTime;
	}

	public void setEduCommittedTime(Integer eduCommittedTime) {
		this.eduCommittedTime = eduCommittedTime;
		if(eduCommittedTime != null){
			putQueryParameter("EduCommittedTime", eduCommittedTime.toString());
		}
	}

	public Boolean getSpPrice() {
		return this.spPrice;
	}

	public void setSpPrice(Boolean spPrice) {
		this.spPrice = spPrice;
		if(spPrice != null){
			putQueryParameter("SpPrice", spPrice.toString());
		}
	}

	public String getEduDesktopBundleId() {
		return this.eduDesktopBundleId;
	}

	public void setEduDesktopBundleId(String eduDesktopBundleId) {
		this.eduDesktopBundleId = eduDesktopBundleId;
		if(eduDesktopBundleId != null){
			putQueryParameter("EduDesktopBundleId", eduDesktopBundleId);
		}
	}

	public String getEduStudentBundleId() {
		return this.eduStudentBundleId;
	}

	public void setEduStudentBundleId(String eduStudentBundleId) {
		this.eduStudentBundleId = eduStudentBundleId;
		if(eduStudentBundleId != null){
			putQueryParameter("EduStudentBundleId", eduStudentBundleId);
		}
	}

	public String getOsType() {
		return this.osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
		if(osType != null){
			putQueryParameter("OsType", osType);
		}
	}

	public Integer getEduCdsSize() {
		return this.eduCdsSize;
	}

	public void setEduCdsSize(Integer eduCdsSize) {
		this.eduCdsSize = eduCdsSize;
		if(eduCdsSize != null){
			putQueryParameter("EduCdsSize", eduCdsSize.toString());
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public String getPromotionId() {
		return this.promotionId;
	}

	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
		if(promotionId != null){
			putQueryParameter("PromotionId", promotionId);
		}
	}

	public Integer getUserDiskSizeGib() {
		return this.userDiskSizeGib;
	}

	public void setUserDiskSizeGib(Integer userDiskSizeGib) {
		this.userDiskSizeGib = userDiskSizeGib;
		if(userDiskSizeGib != null){
			putQueryParameter("UserDiskSizeGib", userDiskSizeGib.toString());
		}
	}

	public String getPeriodUnit() {
		return this.periodUnit;
	}

	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
		if(periodUnit != null){
			putQueryParameter("PeriodUnit", periodUnit);
		}
	}

	public Integer getEduStudentNum() {
		return this.eduStudentNum;
	}

	public void setEduStudentNum(Integer eduStudentNum) {
		this.eduStudentNum = eduStudentNum;
		if(eduStudentNum != null){
			putQueryParameter("EduStudentNum", eduStudentNum.toString());
		}
	}

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
		if(internetChargeType != null){
			putQueryParameter("InternetChargeType", internetChargeType);
		}
	}

	public Integer getPackageSize() {
		return this.packageSize;
	}

	public void setPackageSize(Integer packageSize) {
		this.packageSize = packageSize;
		if(packageSize != null){
			putQueryParameter("PackageSize", packageSize.toString());
		}
	}

	public Integer getRootDiskSizeGib() {
		return this.rootDiskSizeGib;
	}

	public void setRootDiskSizeGib(Integer rootDiskSizeGib) {
		this.rootDiskSizeGib = rootDiskSizeGib;
		if(rootDiskSizeGib != null){
			putQueryParameter("RootDiskSizeGib", rootDiskSizeGib.toString());
		}
	}

	public static class BundleModels {

		private Integer duration;

		private Integer amount;

		private String bundleId;

		public Integer getDuration() {
			return this.duration;
		}

		public void setDuration(Integer duration) {
			this.duration = duration;
		}

		public Integer getAmount() {
			return this.amount;
		}

		public void setAmount(Integer amount) {
			this.amount = amount;
		}

		public String getBundleId() {
			return this.bundleId;
		}

		public void setBundleId(String bundleId) {
			this.bundleId = bundleId;
		}
	}

	@Override
	public Class<DescribePriceResponse> getResponseClass() {
		return DescribePriceResponse.class;
	}

}
