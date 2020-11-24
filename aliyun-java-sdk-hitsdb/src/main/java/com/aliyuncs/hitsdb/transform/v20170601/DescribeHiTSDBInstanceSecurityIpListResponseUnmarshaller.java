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

package com.aliyuncs.hitsdb.transform.v20170601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hitsdb.model.v20170601.DescribeHiTSDBInstanceSecurityIpListResponse;
import com.aliyuncs.hitsdb.model.v20170601.DescribeHiTSDBInstanceSecurityIpListResponse.SecurityIp;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHiTSDBInstanceSecurityIpListResponseUnmarshaller {

	public static DescribeHiTSDBInstanceSecurityIpListResponse unmarshall(DescribeHiTSDBInstanceSecurityIpListResponse describeHiTSDBInstanceSecurityIpListResponse, UnmarshallerContext _ctx) {
		
		describeHiTSDBInstanceSecurityIpListResponse.setRequestId(_ctx.stringValue("DescribeHiTSDBInstanceSecurityIpListResponse.RequestId"));

		List<SecurityIp> securityIpList = new ArrayList<SecurityIp>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHiTSDBInstanceSecurityIpListResponse.SecurityIpList.Length"); i++) {
			SecurityIp securityIp = new SecurityIp();
			securityIp.setIp(_ctx.stringValue("DescribeHiTSDBInstanceSecurityIpListResponse.SecurityIpList["+ i +"].Ip"));

			securityIpList.add(securityIp);
		}
		describeHiTSDBInstanceSecurityIpListResponse.setSecurityIpList(securityIpList);
	 
	 	return describeHiTSDBInstanceSecurityIpListResponse;
	}
}