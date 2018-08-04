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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.RegisterMediaDetailPersonResponse;
import com.aliyuncs.mts.model.v20140618.RegisterMediaDetailPersonResponse.FailedImage;
import com.aliyuncs.mts.model.v20140618.RegisterMediaDetailPersonResponse.FailedImage.ImageFile1;
import com.aliyuncs.mts.model.v20140618.RegisterMediaDetailPersonResponse.RegisteredPersonage;
import com.aliyuncs.mts.model.v20140618.RegisterMediaDetailPersonResponse.RegisteredPersonage.ImageFile;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class RegisterMediaDetailPersonResponseUnmarshaller {

	public static RegisterMediaDetailPersonResponse unmarshall(RegisterMediaDetailPersonResponse registerMediaDetailPersonResponse, UnmarshallerContext context) {
		
		registerMediaDetailPersonResponse.setRequestId(context.stringValue("RegisterMediaDetailPersonResponse.RequestId"));

		List<RegisteredPersonage> registeredPersonages = new ArrayList<RegisteredPersonage>();
		for (int i = 0; i < context.lengthValue("RegisterMediaDetailPersonResponse.RegisteredPersonages.Length"); i++) {
			RegisteredPersonage registeredPersonage = new RegisteredPersonage();
			registeredPersonage.setPersonName(context.stringValue("RegisterMediaDetailPersonResponse.RegisteredPersonages["+ i +"].PersonName"));
			registeredPersonage.setFaceId(context.stringValue("RegisterMediaDetailPersonResponse.RegisteredPersonages["+ i +"].FaceId"));
			registeredPersonage.setTarget(context.stringValue("RegisterMediaDetailPersonResponse.RegisteredPersonages["+ i +"].Target"));
			registeredPersonage.setQuality(context.stringValue("RegisterMediaDetailPersonResponse.RegisteredPersonages["+ i +"].Quality"));
			registeredPersonage.setGender(context.stringValue("RegisterMediaDetailPersonResponse.RegisteredPersonages["+ i +"].Gender"));
			registeredPersonage.setImageId(context.stringValue("RegisterMediaDetailPersonResponse.RegisteredPersonages["+ i +"].ImageId"));

			ImageFile imageFile = new ImageFile();
			imageFile.setBucket(context.stringValue("RegisterMediaDetailPersonResponse.RegisteredPersonages["+ i +"].ImageFile.Bucket"));
			imageFile.setLocation(context.stringValue("RegisterMediaDetailPersonResponse.RegisteredPersonages["+ i +"].ImageFile.Location"));
			imageFile.setObject(context.stringValue("RegisterMediaDetailPersonResponse.RegisteredPersonages["+ i +"].ImageFile.Object"));
			registeredPersonage.setImageFile(imageFile);

			registeredPersonages.add(registeredPersonage);
		}
		registerMediaDetailPersonResponse.setRegisteredPersonages(registeredPersonages);

		List<FailedImage> failedImages = new ArrayList<FailedImage>();
		for (int i = 0; i < context.lengthValue("RegisterMediaDetailPersonResponse.FailedImages.Length"); i++) {
			FailedImage failedImage = new FailedImage();
			failedImage.setCode(context.stringValue("RegisterMediaDetailPersonResponse.FailedImages["+ i +"].Code"));
			failedImage.setSuccess(context.stringValue("RegisterMediaDetailPersonResponse.FailedImages["+ i +"].Success"));

			ImageFile1 imageFile1 = new ImageFile1();
			imageFile1.setBucket(context.stringValue("RegisterMediaDetailPersonResponse.FailedImages["+ i +"].ImageFile.Bucket"));
			imageFile1.setLocation(context.stringValue("RegisterMediaDetailPersonResponse.FailedImages["+ i +"].ImageFile.Location"));
			imageFile1.setObject(context.stringValue("RegisterMediaDetailPersonResponse.FailedImages["+ i +"].ImageFile.Object"));
			failedImage.setImageFile1(imageFile1);

			failedImages.add(failedImage);
		}
		registerMediaDetailPersonResponse.setFailedImages(failedImages);
	 
	 	return registerMediaDetailPersonResponse;
	}
}