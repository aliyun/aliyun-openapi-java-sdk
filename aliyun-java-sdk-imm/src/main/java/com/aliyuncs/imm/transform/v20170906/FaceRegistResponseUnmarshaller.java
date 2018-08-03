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

import com.aliyuncs.imm.model.v20170906.FaceRegistResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class FaceRegistResponseUnmarshaller {

	public static FaceRegistResponse unmarshall(FaceRegistResponse faceRegistResponse, UnmarshallerContext context) {
		
		faceRegistResponse.setRequestId(context.stringValue("FaceRegistResponse.RequestId"));
		faceRegistResponse.setGroupId(context.stringValue("FaceRegistResponse.GroupId"));
		faceRegistResponse.setImageUrl(context.stringValue("FaceRegistResponse.ImageUrl"));
		faceRegistResponse.setImageMd5(context.stringValue("FaceRegistResponse.ImageMd5"));
		faceRegistResponse.setImageId(context.stringValue("FaceRegistResponse.ImageId"));
		faceRegistResponse.setGroupName(context.stringValue("FaceRegistResponse.GroupName"));
		faceRegistResponse.setUser(context.stringValue("FaceRegistResponse.User"));
		faceRegistResponse.setRoll(context.floatValue("FaceRegistResponse.Roll"));
		faceRegistResponse.setFaceId(context.stringValue("FaceRegistResponse.FaceId"));
		faceRegistResponse.setYaw(context.stringValue("FaceRegistResponse.Yaw"));
		faceRegistResponse.setQuality(context.floatValue("FaceRegistResponse.Quality"));
		faceRegistResponse.setGlasses(context.integerValue("FaceRegistResponse.Glasses"));
		faceRegistResponse.setHat(context.integerValue("FaceRegistResponse.Hat"));
		faceRegistResponse.setPitch(context.floatValue("FaceRegistResponse.Pitch"));
		faceRegistResponse.setAge(context.integerValue("FaceRegistResponse.Age"));
		faceRegistResponse.setGender(context.stringValue("FaceRegistResponse.Gender"));

		List<String> axis = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("FaceRegistResponse.Axis.Length"); i++) {
			axis.add(context.stringValue("FaceRegistResponse.Axis["+ i +"]"));
		}
		faceRegistResponse.setAxis(axis);
	 
	 	return faceRegistResponse;
	}
}