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

package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.SearchFaceResponse;
import com.aliyuncs.imm.model.v20170906.SearchFaceResponse.ResultFacesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchFaceResponseUnmarshaller {

	public static SearchFaceResponse unmarshall(SearchFaceResponse searchFaceResponse, UnmarshallerContext _ctx) {
		
		searchFaceResponse.setRequestId(_ctx.stringValue("SearchFaceResponse.RequestId"));
		searchFaceResponse.setImageUri(_ctx.stringValue("SearchFaceResponse.ImageUri"));
		searchFaceResponse.setGroupName(_ctx.stringValue("SearchFaceResponse.GroupName"));
		searchFaceResponse.setGlasses(_ctx.integerValue("SearchFaceResponse.Glasses"));
		searchFaceResponse.setHat(_ctx.integerValue("SearchFaceResponse.Hat"));
		searchFaceResponse.setScore(_ctx.floatValue("SearchFaceResponse.Score"));

		List<String> axis = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SearchFaceResponse.Axis.Length"); i++) {
			axis.add(_ctx.stringValue("SearchFaceResponse.Axis["+ i +"]"));
		}
		searchFaceResponse.setAxis(axis);

		List<ResultFacesItem> resultFaces = new ArrayList<ResultFacesItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchFaceResponse.ResultFaces.Length"); i++) {
			ResultFacesItem resultFacesItem = new ResultFacesItem();
			resultFacesItem.setGroupId(_ctx.stringValue("SearchFaceResponse.ResultFaces["+ i +"].GroupId"));
			resultFacesItem.setUser(_ctx.stringValue("SearchFaceResponse.ResultFaces["+ i +"].User"));
			resultFacesItem.setImageId(_ctx.stringValue("SearchFaceResponse.ResultFaces["+ i +"].ImageId"));
			resultFacesItem.setScore(_ctx.floatValue("SearchFaceResponse.ResultFaces["+ i +"].Score"));
			resultFacesItem.setImageUri(_ctx.stringValue("SearchFaceResponse.ResultFaces["+ i +"].ImageUri"));
			resultFacesItem.setGlasses(_ctx.integerValue("SearchFaceResponse.ResultFaces["+ i +"].Glasses"));
			resultFacesItem.setHat(_ctx.integerValue("SearchFaceResponse.ResultFaces["+ i +"].Hat"));

			List<String> axis1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SearchFaceResponse.ResultFaces["+ i +"].Axis.Length"); j++) {
				axis1.add(_ctx.stringValue("SearchFaceResponse.ResultFaces["+ i +"].Axis["+ j +"]"));
			}
			resultFacesItem.setAxis1(axis1);

			resultFaces.add(resultFacesItem);
		}
		searchFaceResponse.setResultFaces(resultFaces);
	 
	 	return searchFaceResponse;
	}
}