/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.iot.transform.v20160530;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20160530.GetCatsResponse;
import com.aliyuncs.iot.model.v20160530.GetCatsResponse.CatInfo;
import com.aliyuncs.iot.model.v20160530.GetCatsResponse.CatInfo.ChildCat;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCatsResponseUnmarshaller {

	public static GetCatsResponse unmarshall(GetCatsResponse getCatsResponse, UnmarshallerContext context) {
		
		getCatsResponse.setRequestId(context.stringValue("GetCatsResponse.RequestId"));
		getCatsResponse.setSuccess(context.booleanValue("GetCatsResponse.Success"));
		getCatsResponse.setErrorMessage(context.stringValue("GetCatsResponse.ErrorMessage"));

		CatInfo catInfo = new CatInfo();
		catInfo.setId(context.longValue("GetCatsResponse.CatInfo.Id"));
		catInfo.setName(context.stringValue("GetCatsResponse.CatInfo.Name"));
		catInfo.setHasChild(context.booleanValue("GetCatsResponse.CatInfo.HasChild"));

		List<ChildCat> childs = new ArrayList<ChildCat>();
		for (int i = 0; i < context.lengthValue("GetCatsResponse.CatInfo.Childs.Length"); i++) {
			ChildCat childCat = new ChildCat();
			childCat.setId(context.longValue("GetCatsResponse.CatInfo.Childs["+ i +"].Id"));
			childCat.setName(context.stringValue("GetCatsResponse.CatInfo.Childs["+ i +"].Name"));
			childCat.setHasChild(context.booleanValue("GetCatsResponse.CatInfo.Childs["+ i +"].HasChild"));

			childs.add(childCat);
		}
		catInfo.setChilds(childs);
		getCatsResponse.setCatInfo(catInfo);
	 
	 	return getCatsResponse;
	}
}