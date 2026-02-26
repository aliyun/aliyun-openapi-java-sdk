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

package com.aliyuncs.advisor_share.transform.v20180608;

import com.aliyuncs.advisor_share.model.v20180608.CheckConnectivityResponse;
import com.aliyuncs.advisor_share.model.v20180608.CheckConnectivityResponse.Data;
import com.aliyuncs.advisor_share.model.v20180608.CheckConnectivityResponse.Data.RdsWhiteListResult;
import com.aliyuncs.advisor_share.model.v20180608.CheckConnectivityResponse.Data.ResourceNetworkResult;
import com.aliyuncs.advisor_share.model.v20180608.CheckConnectivityResponse.Data.ResourceNetworkResult.DstNetwork;
import com.aliyuncs.advisor_share.model.v20180608.CheckConnectivityResponse.Data.ResourceNetworkResult.SrcNetwork;
import com.aliyuncs.advisor_share.model.v20180608.CheckConnectivityResponse.Data.ResourceStatusResult;
import com.aliyuncs.advisor_share.model.v20180608.CheckConnectivityResponse.Data.ResourceStatusResult.DstStatus;
import com.aliyuncs.advisor_share.model.v20180608.CheckConnectivityResponse.Data.ResourceStatusResult.SrcStatus;
import com.aliyuncs.advisor_share.model.v20180608.CheckConnectivityResponse.Data.SecurityGroupResult;
import com.aliyuncs.advisor_share.model.v20180608.CheckConnectivityResponse.Data.SecurityPunishResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckConnectivityResponseUnmarshaller {

	public static CheckConnectivityResponse unmarshall(CheckConnectivityResponse checkConnectivityResponse, UnmarshallerContext _ctx) {
		
		checkConnectivityResponse.setRequestId(_ctx.stringValue("CheckConnectivityResponse.RequestId"));

		Data data = new Data();
		data.setCheckId(_ctx.stringValue("CheckConnectivityResponse.Data.CheckId"));

		ResourceStatusResult resourceStatusResult = new ResourceStatusResult();
		resourceStatusResult.setSeverity(_ctx.integerValue("CheckConnectivityResponse.Data.ResourceStatusResult.Severity"));
		resourceStatusResult.setErrorCode(_ctx.stringValue("CheckConnectivityResponse.Data.ResourceStatusResult.ErrorCode"));

		SrcStatus srcStatus = new SrcStatus();
		srcStatus.setStatus(_ctx.stringValue("CheckConnectivityResponse.Data.ResourceStatusResult.SrcStatus.Status"));
		srcStatus.setIpAddress(_ctx.stringValue("CheckConnectivityResponse.Data.ResourceStatusResult.SrcStatus.IpAddress"));
		srcStatus.setResourceId(_ctx.stringValue("CheckConnectivityResponse.Data.ResourceStatusResult.SrcStatus.ResourceId"));
		srcStatus.setErrorCode(_ctx.stringValue("CheckConnectivityResponse.Data.ResourceStatusResult.SrcStatus.ErrorCode"));
		srcStatus.setProduct(_ctx.stringValue("CheckConnectivityResponse.Data.ResourceStatusResult.SrcStatus.Product"));
		resourceStatusResult.setSrcStatus(srcStatus);

		DstStatus dstStatus = new DstStatus();
		dstStatus.setStatus(_ctx.stringValue("CheckConnectivityResponse.Data.ResourceStatusResult.DstStatus.Status"));
		dstStatus.setIpAddress(_ctx.stringValue("CheckConnectivityResponse.Data.ResourceStatusResult.DstStatus.IpAddress"));
		dstStatus.setResourceId(_ctx.stringValue("CheckConnectivityResponse.Data.ResourceStatusResult.DstStatus.ResourceId"));
		dstStatus.setErrorCode(_ctx.stringValue("CheckConnectivityResponse.Data.ResourceStatusResult.DstStatus.ErrorCode"));
		dstStatus.setProduct(_ctx.stringValue("CheckConnectivityResponse.Data.ResourceStatusResult.DstStatus.Product"));
		resourceStatusResult.setDstStatus(dstStatus);
		data.setResourceStatusResult(resourceStatusResult);

		ResourceNetworkResult resourceNetworkResult = new ResourceNetworkResult();
		resourceNetworkResult.setSeverity(_ctx.integerValue("CheckConnectivityResponse.Data.ResourceNetworkResult.Severity"));
		resourceNetworkResult.setErrorCode(_ctx.stringValue("CheckConnectivityResponse.Data.ResourceNetworkResult.ErrorCode"));

		SrcNetwork srcNetwork = new SrcNetwork();
		srcNetwork.setVpcId(_ctx.stringValue("CheckConnectivityResponse.Data.ResourceNetworkResult.SrcNetwork.VpcId"));
		srcNetwork.setIpType(_ctx.stringValue("CheckConnectivityResponse.Data.ResourceNetworkResult.SrcNetwork.IpType"));
		srcNetwork.setIpAddress(_ctx.stringValue("CheckConnectivityResponse.Data.ResourceNetworkResult.SrcNetwork.IpAddress"));
		srcNetwork.setErrorCode(_ctx.stringValue("CheckConnectivityResponse.Data.ResourceNetworkResult.SrcNetwork.ErrorCode"));
		srcNetwork.setProduct(_ctx.stringValue("CheckConnectivityResponse.Data.ResourceNetworkResult.SrcNetwork.Product"));
		srcNetwork.setNetworkType(_ctx.stringValue("CheckConnectivityResponse.Data.ResourceNetworkResult.SrcNetwork.NetworkType"));
		srcNetwork.setResourceId(_ctx.stringValue("CheckConnectivityResponse.Data.ResourceNetworkResult.SrcNetwork.ResourceId"));
		srcNetwork.setRegionId(_ctx.stringValue("CheckConnectivityResponse.Data.ResourceNetworkResult.SrcNetwork.RegionId"));
		resourceNetworkResult.setSrcNetwork(srcNetwork);

		DstNetwork dstNetwork = new DstNetwork();
		dstNetwork.setVpcId(_ctx.stringValue("CheckConnectivityResponse.Data.ResourceNetworkResult.DstNetwork.VpcId"));
		dstNetwork.setIpType(_ctx.stringValue("CheckConnectivityResponse.Data.ResourceNetworkResult.DstNetwork.IpType"));
		dstNetwork.setIpAddress(_ctx.stringValue("CheckConnectivityResponse.Data.ResourceNetworkResult.DstNetwork.IpAddress"));
		dstNetwork.setErrorCode(_ctx.stringValue("CheckConnectivityResponse.Data.ResourceNetworkResult.DstNetwork.ErrorCode"));
		dstNetwork.setProduct(_ctx.stringValue("CheckConnectivityResponse.Data.ResourceNetworkResult.DstNetwork.Product"));
		dstNetwork.setNetworkType(_ctx.stringValue("CheckConnectivityResponse.Data.ResourceNetworkResult.DstNetwork.NetworkType"));
		dstNetwork.setResourceId(_ctx.stringValue("CheckConnectivityResponse.Data.ResourceNetworkResult.DstNetwork.ResourceId"));
		dstNetwork.setRegionId(_ctx.stringValue("CheckConnectivityResponse.Data.ResourceNetworkResult.DstNetwork.RegionId"));
		resourceNetworkResult.setDstNetwork(dstNetwork);
		data.setResourceNetworkResult(resourceNetworkResult);

		RdsWhiteListResult rdsWhiteListResult = new RdsWhiteListResult();
		rdsWhiteListResult.setSeverity(_ctx.integerValue("CheckConnectivityResponse.Data.RdsWhiteListResult.Severity"));
		rdsWhiteListResult.setRdsWhiteList(_ctx.stringValue("CheckConnectivityResponse.Data.RdsWhiteListResult.RdsWhiteList"));
		rdsWhiteListResult.setRdsResourceId(_ctx.stringValue("CheckConnectivityResponse.Data.RdsWhiteListResult.RdsResourceId"));
		rdsWhiteListResult.setErrorCode(_ctx.stringValue("CheckConnectivityResponse.Data.RdsWhiteListResult.ErrorCode"));
		data.setRdsWhiteListResult(rdsWhiteListResult);

		SecurityGroupResult securityGroupResult = new SecurityGroupResult();
		securityGroupResult.setDstCheckResult(_ctx.stringValue("CheckConnectivityResponse.Data.SecurityGroupResult.DstCheckResult"));
		securityGroupResult.setSeverity(_ctx.integerValue("CheckConnectivityResponse.Data.SecurityGroupResult.Severity"));
		securityGroupResult.setSrcSecurityGroupRule(_ctx.stringValue("CheckConnectivityResponse.Data.SecurityGroupResult.SrcSecurityGroupRule"));
		securityGroupResult.setSrcResourceId(_ctx.stringValue("CheckConnectivityResponse.Data.SecurityGroupResult.SrcResourceId"));
		securityGroupResult.setErrorCode(_ctx.stringValue("CheckConnectivityResponse.Data.SecurityGroupResult.ErrorCode"));
		securityGroupResult.setDstSecurityGroupRule(_ctx.stringValue("CheckConnectivityResponse.Data.SecurityGroupResult.DstSecurityGroupRule"));
		securityGroupResult.setSrcCheckResult(_ctx.stringValue("CheckConnectivityResponse.Data.SecurityGroupResult.SrcCheckResult"));
		securityGroupResult.setDstResourceId(_ctx.stringValue("CheckConnectivityResponse.Data.SecurityGroupResult.DstResourceId"));
		data.setSecurityGroupResult(securityGroupResult);

		SecurityPunishResult securityPunishResult = new SecurityPunishResult();
		securityPunishResult.setSeverity(_ctx.integerValue("CheckConnectivityResponse.Data.SecurityPunishResult.Severity"));
		securityPunishResult.setSecurityPunishList(_ctx.stringValue("CheckConnectivityResponse.Data.SecurityPunishResult.SecurityPunishList"));
		securityPunishResult.setErrorCode(_ctx.stringValue("CheckConnectivityResponse.Data.SecurityPunishResult.ErrorCode"));
		data.setSecurityPunishResult(securityPunishResult);
		checkConnectivityResponse.setData(data);
	 
	 	return checkConnectivityResponse;
	}
}