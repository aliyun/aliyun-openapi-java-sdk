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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeInstallCodesResponse;
import com.aliyuncs.sas.model.v20181203.DescribeInstallCodesResponse.InstallCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstallCodesResponseUnmarshaller {

	public static DescribeInstallCodesResponse unmarshall(DescribeInstallCodesResponse describeInstallCodesResponse, UnmarshallerContext _ctx) {
		
		describeInstallCodesResponse.setRequestId(_ctx.stringValue("DescribeInstallCodesResponse.RequestId"));

		List<InstallCode> installCodes = new ArrayList<InstallCode>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstallCodesResponse.InstallCodes.Length"); i++) {
			InstallCode installCode = new InstallCode();
			installCode.setOnlyImage(_ctx.booleanValue("DescribeInstallCodesResponse.InstallCodes["+ i +"].OnlyImage"));
			installCode.setCaptchaCode(_ctx.stringValue("DescribeInstallCodesResponse.InstallCodes["+ i +"].CaptchaCode"));
			installCode.setGroupId(_ctx.longValue("DescribeInstallCodesResponse.InstallCodes["+ i +"].GroupId"));
			installCode.setGroupName(_ctx.stringValue("DescribeInstallCodesResponse.InstallCodes["+ i +"].GroupName"));
			installCode.setExpiredDate(_ctx.longValue("DescribeInstallCodesResponse.InstallCodes["+ i +"].ExpiredDate"));
			installCode.setVendorName(_ctx.stringValue("DescribeInstallCodesResponse.InstallCodes["+ i +"].VendorName"));
			installCode.setOs(_ctx.stringValue("DescribeInstallCodesResponse.InstallCodes["+ i +"].Os"));
			installCode.setTag(_ctx.stringValue("DescribeInstallCodesResponse.InstallCodes["+ i +"].Tag"));
			installCode.setVendor(_ctx.integerValue("DescribeInstallCodesResponse.InstallCodes["+ i +"].Vendor"));

			installCodes.add(installCode);
		}
		describeInstallCodesResponse.setInstallCodes(installCodes);
	 
	 	return describeInstallCodesResponse;
	}
}