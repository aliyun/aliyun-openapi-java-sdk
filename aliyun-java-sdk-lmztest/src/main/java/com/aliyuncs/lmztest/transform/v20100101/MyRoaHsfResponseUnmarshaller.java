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

package com.aliyuncs.lmztest.transform.v20100101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.lmztest.model.v20100101.MyRoaHsfResponse;
import com.aliyuncs.lmztest.model.v20100101.MyRoaHsfResponse.AddCRParam;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class MyRoaHsfResponseUnmarshaller {

	public static MyRoaHsfResponse unmarshall(MyRoaHsfResponse myRoaHsfResponse, UnmarshallerContext _ctx) {
		
		myRoaHsfResponse.setId(_ctx.stringValue("MyRoaHsfResponse.Id"));
		myRoaHsfResponse.setName(_ctx.stringValue("MyRoaHsfResponse.Name"));

		List<Map<Object, Object>> infos = _ctx.listMapValue("MyRoaHsfResponse.Infos");
		myRoaHsfResponse.setInfos(infos);

		AddCRParam addCRParam = new AddCRParam();
		addCRParam.setAttributes(_ctx.stringValue("MyRoaHsfResponse.AddCRParam.Attributes"));
		addCRParam.setConfigId(_ctx.stringValue("MyRoaHsfResponse.AddCRParam.ConfigId"));

		List<String> relations = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("MyRoaHsfResponse.AddCRParam.Relations.Length"); i++) {
			relations.add(_ctx.stringValue("MyRoaHsfResponse.AddCRParam.Relations["+ i +"]"));
		}
		addCRParam.setRelations(relations);
		myRoaHsfResponse.setAddCRParam(addCRParam);
	 
	 	return myRoaHsfResponse;
	}
}