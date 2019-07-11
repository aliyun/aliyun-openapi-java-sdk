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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.QueryEccInfoResponse;
import com.aliyuncs.edas.model.v20170801.QueryEccInfoResponse.EccInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEccInfoResponseUnmarshaller {

	public static QueryEccInfoResponse unmarshall(QueryEccInfoResponse queryEccInfoResponse, UnmarshallerContext _ctx) {
		
		queryEccInfoResponse.setRequestId(_ctx.stringValue("QueryEccInfoResponse.RequestId"));
		queryEccInfoResponse.setCode(_ctx.integerValue("QueryEccInfoResponse.Code"));
		queryEccInfoResponse.setMessage(_ctx.stringValue("QueryEccInfoResponse.Message"));

		EccInfo eccInfo = new EccInfo();
		eccInfo.setAppId(_ctx.stringValue("QueryEccInfoResponse.EccInfo.AppId"));
		eccInfo.setEccId(_ctx.stringValue("QueryEccInfoResponse.EccInfo.EccId"));
		eccInfo.setEcuId(_ctx.stringValue("QueryEccInfoResponse.EccInfo.EcuId"));
		eccInfo.setGroupId(_ctx.stringValue("QueryEccInfoResponse.EccInfo.GroupId"));
		eccInfo.setGroupName(_ctx.stringValue("QueryEccInfoResponse.EccInfo.GroupName"));
		eccInfo.setPackageMd5(_ctx.stringValue("QueryEccInfoResponse.EccInfo.PackageMd5"));
		eccInfo.setPackageVersion(_ctx.stringValue("QueryEccInfoResponse.EccInfo.PackageVersion"));
		eccInfo.setVpcId(_ctx.stringValue("QueryEccInfoResponse.EccInfo.VpcId"));
		queryEccInfoResponse.setEccInfo(eccInfo);
	 
	 	return queryEccInfoResponse;
	}
}