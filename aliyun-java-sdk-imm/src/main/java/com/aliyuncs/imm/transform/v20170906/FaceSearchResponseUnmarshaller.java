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

import com.aliyuncs.imm.model.v20170906.FaceSearchResponse;
import com.aliyuncs.imm.model.v20170906.FaceSearchResponse.ResultFacesItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class FaceSearchResponseUnmarshaller {

	public static FaceSearchResponse unmarshall(FaceSearchResponse faceSearchResponse, UnmarshallerContext context) {
		
		faceSearchResponse.setRequestId(context.stringValue("FaceSearchResponse.RequestId"));
		faceSearchResponse.setImageUrl(context.stringValue("FaceSearchResponse.ImageUrl"));
		faceSearchResponse.setGroupName(context.stringValue("FaceSearchResponse.GroupName"));
		faceSearchResponse.setGlasses(context.integerValue("FaceSearchResponse.Glasses"));
		faceSearchResponse.setHat(context.integerValue("FaceSearchResponse.Hat"));
		faceSearchResponse.setScore(context.floatValue("FaceSearchResponse.Score"));
		faceSearchResponse.setHat1(context.integerValue("FaceSearchResponse.Hat"));

		List<String> axis = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("FaceSearchResponse.Axis.Length"); i++) {
			axis.add(context.stringValue("FaceSearchResponse.Axis["+ i +"]"));
		}
		faceSearchResponse.setAxis(axis);

		List<ResultFacesItem> resultFaces = new ArrayList<ResultFacesItem>();
		for (int i = 0; i < context.lengthValue("FaceSearchResponse.ResultFaces.Length"); i++) {
			ResultFacesItem resultFacesItem = new ResultFacesItem();
			resultFacesItem.setGroupId(context.stringValue("FaceSearchResponse.ResultFaces["+ i +"].GroupId"));
			resultFacesItem.setUser(context.stringValue("FaceSearchResponse.ResultFaces["+ i +"].User"));
			resultFacesItem.setImageId(context.stringValue("FaceSearchResponse.ResultFaces["+ i +"].ImageId"));
			resultFacesItem.setScore(context.floatValue("FaceSearchResponse.ResultFaces["+ i +"].Score"));
			resultFacesItem.setImageUrl(context.stringValue("FaceSearchResponse.ResultFaces["+ i +"].ImageUrl"));
			resultFacesItem.setGlasses(context.integerValue("FaceSearchResponse.ResultFaces["+ i +"].Glasses"));
			resultFacesItem.setHat(context.integerValue("FaceSearchResponse.ResultFaces["+ i +"].Hat"));

			List<String> axis2 = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("FaceSearchResponse.ResultFaces["+ i +"].Axis.Length"); j++) {
				axis2.add(context.stringValue("FaceSearchResponse.ResultFaces["+ i +"].Axis["+ j +"]"));
			}
			resultFacesItem.setAxis2(axis2);

			resultFaces.add(resultFacesItem);
		}
		faceSearchResponse.setResultFaces(resultFaces);
	 
	 	return faceSearchResponse;
	}
}