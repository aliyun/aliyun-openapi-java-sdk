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

package com.aliyuncs.alikafka.transform.v20190916;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alikafka.model.v20190916.GetAllowedIpListResponse;
import com.aliyuncs.alikafka.model.v20190916.GetAllowedIpListResponse.AllowedList;
import com.aliyuncs.alikafka.model.v20190916.GetAllowedIpListResponse.AllowedList.IPListVO;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAllowedIpListResponseUnmarshaller {

	public static GetAllowedIpListResponse unmarshall(GetAllowedIpListResponse getAllowedIpListResponse, UnmarshallerContext _ctx) {
		
		getAllowedIpListResponse.setRequestId(_ctx.stringValue("GetAllowedIpListResponse.RequestId"));
		getAllowedIpListResponse.setCode(_ctx.integerValue("GetAllowedIpListResponse.Code"));
		getAllowedIpListResponse.setMessage(_ctx.stringValue("GetAllowedIpListResponse.Message"));
		getAllowedIpListResponse.setSuccess(_ctx.booleanValue("GetAllowedIpListResponse.Success"));

		AllowedList allowedList = new AllowedList();
		allowedList.setDeployType(_ctx.integerValue("GetAllowedIpListResponse.AllowedList.DeployType"));

		List<IPListVO> vpcList = new ArrayList<IPListVO>();
		for (int i = 0; i < _ctx.lengthValue("GetAllowedIpListResponse.AllowedList.VpcList.Length"); i++) {
			IPListVO iPListVO = new IPListVO();
			iPListVO.setPortRange(_ctx.stringValue("GetAllowedIpListResponse.AllowedList.VpcList["+ i +"].PortRange"));
			iPListVO.setAllowedIpGroup(_ctx.mapValue("GetAllowedIpListResponse.AllowedList.VpcList["+ i +"].AllowedIpGroup"));

			List<String> allowedIpList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetAllowedIpListResponse.AllowedList.VpcList["+ i +"].AllowedIpList.Length"); j++) {
				allowedIpList.add(_ctx.stringValue("GetAllowedIpListResponse.AllowedList.VpcList["+ i +"].AllowedIpList["+ j +"]"));
			}
			iPListVO.setAllowedIpList(allowedIpList);

			vpcList.add(iPListVO);
		}
		allowedList.setVpcList(vpcList);

		List<IPListVO> internetList = new ArrayList<IPListVO>();
		for (int i = 0; i < _ctx.lengthValue("GetAllowedIpListResponse.AllowedList.InternetList.Length"); i++) {
			IPListVO iPListVO1 = new IPListVO();
			iPListVO1.setPortRange(_ctx.stringValue("GetAllowedIpListResponse.AllowedList.InternetList["+ i +"].PortRange"));
			iPListVO1.setAllowedIpGroup(_ctx.mapValue("GetAllowedIpListResponse.AllowedList.InternetList["+ i +"].AllowedIpGroup"));

			List<String> allowedIpList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetAllowedIpListResponse.AllowedList.InternetList["+ i +"].AllowedIpList.Length"); j++) {
				allowedIpList.add(_ctx.stringValue("GetAllowedIpListResponse.AllowedList.InternetList["+ i +"].AllowedIpList["+ j +"]"));
			}
			iPListVO1.setAllowedIpList(allowedIpList);

			internetList.add(iPListVO1);
		}
		allowedList.setInternetList(internetList);
		getAllowedIpListResponse.setAllowedList(allowedList);
	 
	 	return getAllowedIpListResponse;
	}
}