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

import com.aliyuncs.sas.model.v20181203.DescribeSecurityEventMarkMissListResponse;
import com.aliyuncs.sas.model.v20181203.DescribeSecurityEventMarkMissListResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribeSecurityEventMarkMissListResponse.SecurityEventMarkMissReponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecurityEventMarkMissListResponseUnmarshaller {

	public static DescribeSecurityEventMarkMissListResponse unmarshall(DescribeSecurityEventMarkMissListResponse describeSecurityEventMarkMissListResponse, UnmarshallerContext _ctx) {
		
		describeSecurityEventMarkMissListResponse.setRequestId(_ctx.stringValue("DescribeSecurityEventMarkMissListResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeSecurityEventMarkMissListResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeSecurityEventMarkMissListResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeSecurityEventMarkMissListResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeSecurityEventMarkMissListResponse.PageInfo.Count"));
		describeSecurityEventMarkMissListResponse.setPageInfo(pageInfo);

		List<SecurityEventMarkMissReponse> list = new ArrayList<SecurityEventMarkMissReponse>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityEventMarkMissListResponse.List.Length"); i++) {
			SecurityEventMarkMissReponse securityEventMarkMissReponse = new SecurityEventMarkMissReponse();
			securityEventMarkMissReponse.setEventName(_ctx.stringValue("DescribeSecurityEventMarkMissListResponse.List["+ i +"].EventName"));
			securityEventMarkMissReponse.setInternetIp(_ctx.stringValue("DescribeSecurityEventMarkMissListResponse.List["+ i +"].InternetIp"));
			securityEventMarkMissReponse.setEventNameOriginal(_ctx.stringValue("DescribeSecurityEventMarkMissListResponse.List["+ i +"].EventNameOriginal"));
			securityEventMarkMissReponse.setAliUid(_ctx.longValue("DescribeSecurityEventMarkMissListResponse.List["+ i +"].AliUid"));
			securityEventMarkMissReponse.setFieldValue(_ctx.stringValue("DescribeSecurityEventMarkMissListResponse.List["+ i +"].FieldValue"));
			securityEventMarkMissReponse.setInstanceId(_ctx.stringValue("DescribeSecurityEventMarkMissListResponse.List["+ i +"].InstanceId"));
			securityEventMarkMissReponse.setField(_ctx.stringValue("DescribeSecurityEventMarkMissListResponse.List["+ i +"].Field"));
			securityEventMarkMissReponse.setIntranetIp(_ctx.stringValue("DescribeSecurityEventMarkMissListResponse.List["+ i +"].IntranetIp"));
			securityEventMarkMissReponse.setFiledAliasName(_ctx.stringValue("DescribeSecurityEventMarkMissListResponse.List["+ i +"].FiledAliasName"));
			securityEventMarkMissReponse.setUuid(_ctx.stringValue("DescribeSecurityEventMarkMissListResponse.List["+ i +"].Uuid"));
			securityEventMarkMissReponse.setOperate(_ctx.stringValue("DescribeSecurityEventMarkMissListResponse.List["+ i +"].Operate"));
			securityEventMarkMissReponse.setEventTypeOriginal(_ctx.stringValue("DescribeSecurityEventMarkMissListResponse.List["+ i +"].EventTypeOriginal"));
			securityEventMarkMissReponse.setEventType(_ctx.stringValue("DescribeSecurityEventMarkMissListResponse.List["+ i +"].EventType"));
			securityEventMarkMissReponse.setInstanceName(_ctx.stringValue("DescribeSecurityEventMarkMissListResponse.List["+ i +"].InstanceName"));
			securityEventMarkMissReponse.setId(_ctx.longValue("DescribeSecurityEventMarkMissListResponse.List["+ i +"].Id"));

			list.add(securityEventMarkMissReponse);
		}
		describeSecurityEventMarkMissListResponse.setList(list);
	 
	 	return describeSecurityEventMarkMissListResponse;
	}
}