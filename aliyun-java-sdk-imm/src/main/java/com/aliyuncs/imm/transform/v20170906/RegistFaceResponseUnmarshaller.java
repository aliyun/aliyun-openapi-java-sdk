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

import com.aliyuncs.imm.model.v20170906.RegistFaceResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class RegistFaceResponseUnmarshaller {

	public static RegistFaceResponse unmarshall(RegistFaceResponse registFaceResponse, UnmarshallerContext context) {
		
		registFaceResponse.setRequestId(context.stringValue("RegistFaceResponse.RequestId"));
		registFaceResponse.setGroupId(context.stringValue("RegistFaceResponse.GroupId"));
		registFaceResponse.setImageUrl(context.stringValue("RegistFaceResponse.ImageUrl"));
		registFaceResponse.setImageMd5(context.stringValue("RegistFaceResponse.ImageMd5"));
		registFaceResponse.setImageId(context.stringValue("RegistFaceResponse.ImageId"));
		registFaceResponse.setGroupName(context.stringValue("RegistFaceResponse.GroupName"));
		registFaceResponse.setUser(context.stringValue("RegistFaceResponse.User"));
		registFaceResponse.setRoll(context.floatValue("RegistFaceResponse.Roll"));
		registFaceResponse.setFaceId(context.stringValue("RegistFaceResponse.FaceId"));
		registFaceResponse.setYaw(context.stringValue("RegistFaceResponse.Yaw"));
		registFaceResponse.setQuality(context.floatValue("RegistFaceResponse.Quality"));
		registFaceResponse.setGlasses(context.integerValue("RegistFaceResponse.Glasses"));
		registFaceResponse.setHat(context.integerValue("RegistFaceResponse.Hat"));
		registFaceResponse.setPitch(context.floatValue("RegistFaceResponse.Pitch"));
		registFaceResponse.setAge(context.integerValue("RegistFaceResponse.Age"));
		registFaceResponse.setGender(context.stringValue("RegistFaceResponse.Gender"));

		List<String> axis = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("RegistFaceResponse.Axis.Length"); i++) {
			axis.add(context.stringValue("RegistFaceResponse.Axis["+ i +"]"));
		}
		registFaceResponse.setAxis(axis);
	 
	 	return registFaceResponse;
	}
}