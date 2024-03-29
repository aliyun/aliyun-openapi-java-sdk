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

import com.aliyuncs.sas.model.v20181203.DescribeAllEntityResponse;
import com.aliyuncs.sas.model.v20181203.DescribeAllEntityResponse.Entity;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAllEntityResponseUnmarshaller {

	public static DescribeAllEntityResponse unmarshall(DescribeAllEntityResponse describeAllEntityResponse, UnmarshallerContext _ctx) {
		
		describeAllEntityResponse.setRequestId(_ctx.stringValue("DescribeAllEntityResponse.RequestId"));

		List<Entity> entityList = new ArrayList<Entity>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAllEntityResponse.EntityList.Length"); i++) {
			Entity entity = new Entity();
			entity.setUuid(_ctx.stringValue("DescribeAllEntityResponse.EntityList["+ i +"].Uuid"));
			entity.setGroupId(_ctx.integerValue("DescribeAllEntityResponse.EntityList["+ i +"].GroupId"));
			entity.setInternetIp(_ctx.stringValue("DescribeAllEntityResponse.EntityList["+ i +"].InternetIp"));
			entity.setInstanceName(_ctx.stringValue("DescribeAllEntityResponse.EntityList["+ i +"].InstanceName"));
			entity.setIp(_ctx.stringValue("DescribeAllEntityResponse.EntityList["+ i +"].Ip"));
			entity.setOs(_ctx.stringValue("DescribeAllEntityResponse.EntityList["+ i +"].Os"));
			entity.setIntranetIp(_ctx.stringValue("DescribeAllEntityResponse.EntityList["+ i +"].IntranetIp"));

			entityList.add(entity);
		}
		describeAllEntityResponse.setEntityList(entityList);
	 
	 	return describeAllEntityResponse;
	}
}