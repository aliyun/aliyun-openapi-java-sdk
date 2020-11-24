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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeSceneDefenseObjectsResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeSceneDefenseObjectsResponse.Object;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSceneDefenseObjectsResponseUnmarshaller {

	public static DescribeSceneDefenseObjectsResponse unmarshall(DescribeSceneDefenseObjectsResponse describeSceneDefenseObjectsResponse, UnmarshallerContext _ctx) {
		
		describeSceneDefenseObjectsResponse.setRequestId(_ctx.stringValue("DescribeSceneDefenseObjectsResponse.RequestId"));
		describeSceneDefenseObjectsResponse.setSuccess(_ctx.booleanValue("DescribeSceneDefenseObjectsResponse.Success"));

		List<Object> objects = new ArrayList<Object>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSceneDefenseObjectsResponse.Objects.Length"); i++) {
			Object object = new Object();
			object.setPolicyId(_ctx.stringValue("DescribeSceneDefenseObjectsResponse.Objects["+ i +"].PolicyId"));
			object.setDomain(_ctx.stringValue("DescribeSceneDefenseObjectsResponse.Objects["+ i +"].Domain"));
			object.setVip(_ctx.stringValue("DescribeSceneDefenseObjectsResponse.Objects["+ i +"].Vip"));

			objects.add(object);
		}
		describeSceneDefenseObjectsResponse.setObjects(objects);
	 
	 	return describeSceneDefenseObjectsResponse;
	}
}