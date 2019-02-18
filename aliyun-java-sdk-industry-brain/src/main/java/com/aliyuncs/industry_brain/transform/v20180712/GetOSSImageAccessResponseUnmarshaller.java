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

package com.aliyuncs.industry_brain.transform.v20180712;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.industry_brain.model.v20180712.GetOSSImageAccessResponse;
import com.aliyuncs.industry_brain.model.v20180712.GetOSSImageAccessResponse.StsInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOSSImageAccessResponseUnmarshaller {

	public static GetOSSImageAccessResponse unmarshall(GetOSSImageAccessResponse getOSSImageAccessResponse, UnmarshallerContext context) {
		
		getOSSImageAccessResponse.setRequestId(context.stringValue("GetOSSImageAccessResponse.RequestId"));

		StsInfo stsInfo = new StsInfo();
		stsInfo.setAccessKeyId(context.stringValue("GetOSSImageAccessResponse.StsInfo.AccessKeyId"));
		stsInfo.setAccessKeySecret(context.stringValue("GetOSSImageAccessResponse.StsInfo.AccessKeySecret"));
		stsInfo.setSecurityToken(context.stringValue("GetOSSImageAccessResponse.StsInfo.SecurityToken"));
		stsInfo.setExpiration(context.stringValue("GetOSSImageAccessResponse.StsInfo.Expiration"));
		stsInfo.setBucketName(context.stringValue("GetOSSImageAccessResponse.StsInfo.BucketName"));
		stsInfo.setEndpoint(context.stringValue("GetOSSImageAccessResponse.StsInfo.Endpoint"));

		List<String> prefixList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetOSSImageAccessResponse.StsInfo.PrefixList.Length"); i++) {
			prefixList.add(context.stringValue("GetOSSImageAccessResponse.StsInfo.PrefixList["+ i +"]"));
		}
		stsInfo.setPrefixList(prefixList);
		getOSSImageAccessResponse.setStsInfo(stsInfo);
	 
	 	return getOSSImageAccessResponse;
	}
}