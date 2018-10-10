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

import com.aliyuncs.imm.model.v20170906.GetFaceSearchImageResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFaceSearchImageResponseUnmarshaller {

	public static GetFaceSearchImageResponse unmarshall(GetFaceSearchImageResponse getFaceSearchImageResponse, UnmarshallerContext context) {
		
		getFaceSearchImageResponse.setRequestId(context.stringValue("GetFaceSearchImageResponse.RequestId"));
		getFaceSearchImageResponse.setGroupName(context.stringValue("GetFaceSearchImageResponse.GroupName"));
		getFaceSearchImageResponse.setGroupId(context.stringValue("GetFaceSearchImageResponse.GroupId"));
		getFaceSearchImageResponse.setGender(context.stringValue("GetFaceSearchImageResponse.Gender"));
		getFaceSearchImageResponse.setAge(context.integerValue("GetFaceSearchImageResponse.Age"));
		getFaceSearchImageResponse.setPitch(context.floatValue("GetFaceSearchImageResponse.Pitch"));
		getFaceSearchImageResponse.setImageUri(context.stringValue("GetFaceSearchImageResponse.ImageUri"));
		getFaceSearchImageResponse.setImageMd5(context.stringValue("GetFaceSearchImageResponse.ImageMd5"));
		getFaceSearchImageResponse.setRoll(context.floatValue("GetFaceSearchImageResponse.Roll"));
		getFaceSearchImageResponse.setFaceId(context.stringValue("GetFaceSearchImageResponse.FaceId"));
		getFaceSearchImageResponse.setYaw(context.floatValue("GetFaceSearchImageResponse.Yaw"));
		getFaceSearchImageResponse.setQuality(context.floatValue("GetFaceSearchImageResponse.Quality"));
		getFaceSearchImageResponse.setHat(context.integerValue("GetFaceSearchImageResponse.Hat"));
		getFaceSearchImageResponse.setGlasses(context.integerValue("GetFaceSearchImageResponse.Glasses"));
		getFaceSearchImageResponse.setImageId(context.stringValue("GetFaceSearchImageResponse.ImageId"));
		getFaceSearchImageResponse.setUser(context.stringValue("GetFaceSearchImageResponse.User"));

		List<String> axis = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetFaceSearchImageResponse.Axis.Length"); i++) {
			axis.add(context.stringValue("GetFaceSearchImageResponse.Axis["+ i +"]"));
		}
		getFaceSearchImageResponse.setAxis(axis);
	 
	 	return getFaceSearchImageResponse;
	}
}