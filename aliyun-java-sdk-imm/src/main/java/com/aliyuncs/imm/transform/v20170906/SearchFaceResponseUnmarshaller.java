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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchFaceResponseUnmarshaller {

	public static SearchFaceResponse unmarshall(SearchFaceResponse searchFaceResponse, UnmarshallerContext context) {
		
		searchFaceResponse.setRequestId(context.stringValue("SearchFaceResponse.RequestId"));
		searchFaceResponse.setImageUrl(context.stringValue("SearchFaceResponse.ImageUrl"));
		searchFaceResponse.setGroupName(context.stringValue("SearchFaceResponse.GroupName"));
		searchFaceResponse.setGlasses(context.integerValue("SearchFaceResponse.Glasses"));
		searchFaceResponse.setHat(context.integerValue("SearchFaceResponse.Hat"));
		searchFaceResponse.setScore(context.floatValue("SearchFaceResponse.Score"));
		searchFaceResponse.setHat1(context.integerValue("SearchFaceResponse.Hat"));

		List<String> axis = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("SearchFaceResponse.Axis.Length"); i++) {
			axis.add(context.stringValue("SearchFaceResponse.Axis["+ i +"]"));
		}
		searchFaceResponse.setAxis(axis);

		List<ResultFacesItem> resultFaces = new ArrayList<ResultFacesItem>();
		for (int i = 0; i < context.lengthValue("SearchFaceResponse.ResultFaces.Length"); i++) {
			ResultFacesItem resultFacesItem = new ResultFacesItem();
			resultFacesItem.setGroupId(context.stringValue("SearchFaceResponse.ResultFaces["+ i +"].GroupId"));
			resultFacesItem.setUser(context.stringValue("SearchFaceResponse.ResultFaces["+ i +"].User"));
			resultFacesItem.setImageId(context.stringValue("SearchFaceResponse.ResultFaces["+ i +"].ImageId"));
			resultFacesItem.setScore(context.floatValue("SearchFaceResponse.ResultFaces["+ i +"].Score"));
			resultFacesItem.setImageUrl(context.stringValue("SearchFaceResponse.ResultFaces["+ i +"].ImageUrl"));
			resultFacesItem.setGlasses(context.integerValue("SearchFaceResponse.ResultFaces["+ i +"].Glasses"));
			resultFacesItem.setHat(context.integerValue("SearchFaceResponse.ResultFaces["+ i +"].Hat"));

			List<String> axis2 = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("SearchFaceResponse.ResultFaces["+ i +"].Axis.Length"); j++) {
				axis2.add(context.stringValue("SearchFaceResponse.ResultFaces["+ i +"].Axis["+ j +"]"));
			}
			resultFacesItem.setAxis2(axis2);

			resultFaces.add(resultFacesItem);
		}
		searchFaceResponse.setResultFaces(resultFaces);
	 
	 	return searchFaceResponse;
	}
}