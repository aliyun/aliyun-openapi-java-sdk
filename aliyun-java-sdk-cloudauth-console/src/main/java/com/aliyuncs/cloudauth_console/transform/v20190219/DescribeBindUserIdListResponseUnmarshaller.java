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

package com.aliyuncs.cloudauth_console.transform.v20190219;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudauth_console.model.v20190219.DescribeBindUserIdListResponse;
import com.aliyuncs.cloudauth_console.model.v20190219.DescribeBindUserIdListResponse.UserInfoVo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBindUserIdListResponseUnmarshaller {

	public static DescribeBindUserIdListResponse unmarshall(DescribeBindUserIdListResponse describeBindUserIdListResponse, UnmarshallerContext _ctx) {
		
		describeBindUserIdListResponse.setRequestId(_ctx.stringValue("DescribeBindUserIdListResponse.RequestId"));

		List<UserInfoVo> data = new ArrayList<UserInfoVo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBindUserIdListResponse.Data.Length"); i++) {
			UserInfoVo userInfoVo = new UserInfoVo();
			userInfoVo.setId(_ctx.longValue("DescribeBindUserIdListResponse.Data["+ i +"].Id"));
			userInfoVo.setUserName(_ctx.stringValue("DescribeBindUserIdListResponse.Data["+ i +"].UserName"));
			userInfoVo.setCertificateType(_ctx.stringValue("DescribeBindUserIdListResponse.Data["+ i +"].CertificateType"));
			userInfoVo.setCertificateNo(_ctx.stringValue("DescribeBindUserIdListResponse.Data["+ i +"].CertificateNo"));

			data.add(userInfoVo);
		}
		describeBindUserIdListResponse.setData(data);
	 
	 	return describeBindUserIdListResponse;
	}
}