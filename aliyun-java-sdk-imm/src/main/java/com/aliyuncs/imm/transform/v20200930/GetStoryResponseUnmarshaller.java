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

package com.aliyuncs.imm.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20200930.GetStoryResponse;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.AddressesItem20;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.AudioCoversItem32;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.AudioCoversItem32.CroppingSuggestionsItem36;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.AudioCoversItem32.CroppingSuggestionsItem36.Boundary37;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.AudioCoversItem32.ImageScore33;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.AudioCoversItem32.OCRContentsItem38;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.AudioCoversItem32.OCRContentsItem38.Boundary39;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.AudioStreamsItem31;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.CroppingSuggestionsItem25;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.CroppingSuggestionsItem25.Boundary26;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.FiguresItem21;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.FiguresItem21.Boundary22;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.FiguresItem21.HeadPose23;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.ImageScore10;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.LabelsItem24;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.OCRContentsItem27;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.OCRContentsItem27.Boundary28;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.SubtitlesItem30;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.VideoStreamsItem29;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.AddressesItem;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.AudioCoversItem;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.AudioCoversItem.CroppingSuggestionsItem6;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.AudioCoversItem.CroppingSuggestionsItem6.Boundary7;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.AudioCoversItem.ImageScore3;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.AudioCoversItem.OCRContentsItem8;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.AudioCoversItem.OCRContentsItem8.Boundary9;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.AudioStreamsItem;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.CroppingSuggestionsItem;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.CroppingSuggestionsItem.Boundary1;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.FiguresItem;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.FiguresItem.Boundary;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.FiguresItem.HeadPose;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.ImageScore;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.LabelsItem;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.OCRContentsItem;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.OCRContentsItem.Boundary2;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.SubtitlesItem;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.VideoStreamsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStoryResponseUnmarshaller {

	public static GetStoryResponse unmarshall(GetStoryResponse getStoryResponse, UnmarshallerContext _ctx) {
		
		getStoryResponse.setRequestId(_ctx.stringValue("GetStoryResponse.RequestId"));

		Story story = new Story();
		story.setOwnerId(_ctx.stringValue("GetStoryResponse.Story.OwnerId"));
		story.setProjectName(_ctx.stringValue("GetStoryResponse.Story.ProjectName"));
		story.setDatasetName(_ctx.stringValue("GetStoryResponse.Story.DatasetName"));
		story.setObjectId(_ctx.stringValue("GetStoryResponse.Story.ObjectId"));
		story.setObjectType(_ctx.stringValue("GetStoryResponse.Story.ObjectType"));
		story.setUpdateTime(_ctx.stringValue("GetStoryResponse.Story.UpdateTime"));
		story.setCreateTime(_ctx.stringValue("GetStoryResponse.Story.CreateTime"));
		story.setStoryName(_ctx.stringValue("GetStoryResponse.Story.StoryName"));
		story.setStoryType(_ctx.stringValue("GetStoryResponse.Story.StoryType"));
		story.setStorySubType(_ctx.stringValue("GetStoryResponse.Story.StorySubType"));
		story.setStoryStartTime(_ctx.stringValue("GetStoryResponse.Story.StoryStartTime"));
		story.setStoryEndTime(_ctx.stringValue("GetStoryResponse.Story.StoryEndTime"));
		story.setCustomId(_ctx.stringValue("GetStoryResponse.Story.CustomId"));
		story.setCustomLabels(_ctx.mapValue("GetStoryResponse.Story.CustomLabels"));

		List<String> figureClusterIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetStoryResponse.Story.FigureClusterIds.Length"); i++) {
			figureClusterIds.add(_ctx.stringValue("GetStoryResponse.Story.FigureClusterIds["+ i +"]"));
		}
		story.setFigureClusterIds(figureClusterIds);

		Cover cover = new Cover();
		cover.setOwnerId(_ctx.stringValue("GetStoryResponse.Story.Cover.OwnerId"));
		cover.setProjectName(_ctx.stringValue("GetStoryResponse.Story.Cover.ProjectName"));
		cover.setDatasetName(_ctx.stringValue("GetStoryResponse.Story.Cover.DatasetName"));
		cover.setObjectType(_ctx.stringValue("GetStoryResponse.Story.Cover.ObjectType"));
		cover.setObjectId(_ctx.stringValue("GetStoryResponse.Story.Cover.ObjectId"));
		cover.setUpdateTime(_ctx.stringValue("GetStoryResponse.Story.Cover.UpdateTime"));
		cover.setCreateTime(_ctx.stringValue("GetStoryResponse.Story.Cover.CreateTime"));
		cover.setURI(_ctx.stringValue("GetStoryResponse.Story.Cover.URI"));
		cover.setOSSURI(_ctx.stringValue("GetStoryResponse.Story.Cover.OSSURI"));
		cover.setFilename(_ctx.stringValue("GetStoryResponse.Story.Cover.Filename"));
		cover.setMediaType(_ctx.stringValue("GetStoryResponse.Story.Cover.MediaType"));
		cover.setContentType(_ctx.stringValue("GetStoryResponse.Story.Cover.ContentType"));
		cover.setSize(_ctx.longValue("GetStoryResponse.Story.Cover.Size"));
		cover.setFileHash(_ctx.stringValue("GetStoryResponse.Story.Cover.FileHash"));
		cover.setFileModifiedTime(_ctx.stringValue("GetStoryResponse.Story.Cover.FileModifiedTime"));
		cover.setFileCreateTime(_ctx.stringValue("GetStoryResponse.Story.Cover.FileCreateTime"));
		cover.setFileAccessTime(_ctx.stringValue("GetStoryResponse.Story.Cover.FileAccessTime"));
		cover.setProduceTime(_ctx.stringValue("GetStoryResponse.Story.Cover.ProduceTime"));
		cover.setLatLong(_ctx.stringValue("GetStoryResponse.Story.Cover.LatLong"));
		cover.setTimezone(_ctx.stringValue("GetStoryResponse.Story.Cover.Timezone"));
		cover.setTravelClusterId(_ctx.stringValue("GetStoryResponse.Story.Cover.TravelClusterId"));
		cover.setOrientation(_ctx.longValue("GetStoryResponse.Story.Cover.Orientation"));
		cover.setFigureCount(_ctx.longValue("GetStoryResponse.Story.Cover.FigureCount"));
		cover.setTitle(_ctx.stringValue("GetStoryResponse.Story.Cover.Title"));
		cover.setImageWidth(_ctx.longValue("GetStoryResponse.Story.Cover.ImageWidth"));
		cover.setImageHeight(_ctx.longValue("GetStoryResponse.Story.Cover.ImageHeight"));
		cover.setEXIF(_ctx.stringValue("GetStoryResponse.Story.Cover.EXIF"));
		cover.setVideoWidth(_ctx.longValue("GetStoryResponse.Story.Cover.VideoWidth"));
		cover.setVideoHeight(_ctx.longValue("GetStoryResponse.Story.Cover.VideoHeight"));
		cover.setArtist(_ctx.stringValue("GetStoryResponse.Story.Cover.Artist"));
		cover.setAlbumArtist(_ctx.stringValue("GetStoryResponse.Story.Cover.AlbumArtist"));
		cover.setComposer(_ctx.stringValue("GetStoryResponse.Story.Cover.Composer"));
		cover.setPerformer(_ctx.stringValue("GetStoryResponse.Story.Cover.Performer"));
		cover.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Cover.Language"));
		cover.setAlbum(_ctx.stringValue("GetStoryResponse.Story.Cover.Album"));
		cover.setDocumentLanguage(_ctx.stringValue("GetStoryResponse.Story.Cover.DocumentLanguage"));
		cover.setPageCount(_ctx.longValue("GetStoryResponse.Story.Cover.PageCount"));
		cover.setDocumentContent(_ctx.stringValue("GetStoryResponse.Story.Cover.DocumentContent"));
		cover.setETag(_ctx.stringValue("GetStoryResponse.Story.Cover.ETag"));
		cover.setCacheControl(_ctx.stringValue("GetStoryResponse.Story.Cover.CacheControl"));
		cover.setContentDisposition(_ctx.stringValue("GetStoryResponse.Story.Cover.ContentDisposition"));
		cover.setContentEncoding(_ctx.stringValue("GetStoryResponse.Story.Cover.ContentEncoding"));
		cover.setContentLanguage(_ctx.stringValue("GetStoryResponse.Story.Cover.ContentLanguage"));
		cover.setAccessControlAllowOrigin(_ctx.stringValue("GetStoryResponse.Story.Cover.AccessControlAllowOrigin"));
		cover.setAccessControlRequestMethod(_ctx.stringValue("GetStoryResponse.Story.Cover.AccessControlRequestMethod"));
		cover.setServerSideEncryptionCustomerAlgorithm(_ctx.stringValue("GetStoryResponse.Story.Cover.ServerSideEncryptionCustomerAlgorithm"));
		cover.setServerSideEncryption(_ctx.stringValue("GetStoryResponse.Story.Cover.ServerSideEncryption"));
		cover.setServerSideDataEncryption(_ctx.stringValue("GetStoryResponse.Story.Cover.ServerSideDataEncryption"));
		cover.setServerSideEncryptionKeyId(_ctx.stringValue("GetStoryResponse.Story.Cover.ServerSideEncryptionKeyId"));
		cover.setOSSStorageClass(_ctx.stringValue("GetStoryResponse.Story.Cover.OSSStorageClass"));
		cover.setOSSCRC64(_ctx.stringValue("GetStoryResponse.Story.Cover.OSSCRC64"));
		cover.setObjectACL(_ctx.stringValue("GetStoryResponse.Story.Cover.ObjectACL"));
		cover.setContentMd5(_ctx.stringValue("GetStoryResponse.Story.Cover.ContentMd5"));
		cover.setOSSUserMeta(_ctx.mapValue("GetStoryResponse.Story.Cover.OSSUserMeta"));
		cover.setOSSTaggingCount(_ctx.longValue("GetStoryResponse.Story.Cover.OSSTaggingCount"));
		cover.setOSSTagging(_ctx.mapValue("GetStoryResponse.Story.Cover.OSSTagging"));
		cover.setOSSExpiration(_ctx.stringValue("GetStoryResponse.Story.Cover.OSSExpiration"));
		cover.setOSSVersionId(_ctx.stringValue("GetStoryResponse.Story.Cover.OSSVersionId"));
		cover.setOSSDeleteMarker(_ctx.stringValue("GetStoryResponse.Story.Cover.OSSDeleteMarker"));
		cover.setOSSObjectType(_ctx.stringValue("GetStoryResponse.Story.Cover.OSSObjectType"));
		cover.setCustomId(_ctx.stringValue("GetStoryResponse.Story.Cover.CustomId"));
		cover.setCustomLabels(_ctx.mapValue("GetStoryResponse.Story.Cover.CustomLabels"));
		cover.setStreamCount(_ctx.longValue("GetStoryResponse.Story.Cover.StreamCount"));
		cover.setProgramCount(_ctx.longValue("GetStoryResponse.Story.Cover.ProgramCount"));
		cover.setFormatName(_ctx.stringValue("GetStoryResponse.Story.Cover.FormatName"));
		cover.setFormatLongName(_ctx.stringValue("GetStoryResponse.Story.Cover.FormatLongName"));
		cover.setStartTime(_ctx.doubleValue("GetStoryResponse.Story.Cover.StartTime"));
		cover.setBitrate(_ctx.longValue("GetStoryResponse.Story.Cover.Bitrate"));
		cover.setDuration(_ctx.doubleValue("GetStoryResponse.Story.Cover.Duration"));

		ImageScore10 imageScore10 = new ImageScore10();
		imageScore10.setOverallQualityScore(_ctx.floatValue("GetStoryResponse.Story.Cover.ImageScore.OverallQualityScore"));
		cover.setImageScore10(imageScore10);

		List<AddressesItem20> addresses11 = new ArrayList<AddressesItem20>();
		for (int i = 0; i < _ctx.lengthValue("GetStoryResponse.Story.Cover.Addresses.Length"); i++) {
			AddressesItem20 addressesItem20 = new AddressesItem20();
			addressesItem20.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Cover.Addresses["+ i +"].Language"));
			addressesItem20.setAddressLine(_ctx.stringValue("GetStoryResponse.Story.Cover.Addresses["+ i +"].AddressLine"));
			addressesItem20.setCountry(_ctx.stringValue("GetStoryResponse.Story.Cover.Addresses["+ i +"].Country"));
			addressesItem20.setProvince(_ctx.stringValue("GetStoryResponse.Story.Cover.Addresses["+ i +"].Province"));
			addressesItem20.setCity(_ctx.stringValue("GetStoryResponse.Story.Cover.Addresses["+ i +"].City"));
			addressesItem20.setDistrict(_ctx.stringValue("GetStoryResponse.Story.Cover.Addresses["+ i +"].District"));
			addressesItem20.setTownship(_ctx.stringValue("GetStoryResponse.Story.Cover.Addresses["+ i +"].Township"));

			addresses11.add(addressesItem20);
		}
		cover.setAddresses11(addresses11);

		List<FiguresItem21> figures12 = new ArrayList<FiguresItem21>();
		for (int i = 0; i < _ctx.lengthValue("GetStoryResponse.Story.Cover.Figures.Length"); i++) {
			FiguresItem21 figuresItem21 = new FiguresItem21();
			figuresItem21.setFigureId(_ctx.stringValue("GetStoryResponse.Story.Cover.Figures["+ i +"].FigureId"));
			figuresItem21.setFigureConfidence(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].FigureConfidence"));
			figuresItem21.setFigureClusterId(_ctx.stringValue("GetStoryResponse.Story.Cover.Figures["+ i +"].FigureClusterId"));
			figuresItem21.setFigureClusterConfidence(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].FigureClusterConfidence"));
			figuresItem21.setFigureType(_ctx.stringValue("GetStoryResponse.Story.Cover.Figures["+ i +"].FigureType"));
			figuresItem21.setAge(_ctx.longValue("GetStoryResponse.Story.Cover.Figures["+ i +"].Age"));
			figuresItem21.setAgeSD(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].AgeSD"));
			figuresItem21.setGender(_ctx.stringValue("GetStoryResponse.Story.Cover.Figures["+ i +"].Gender"));
			figuresItem21.setGenderConfidence(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].GenderConfidence"));
			figuresItem21.setEmotion(_ctx.stringValue("GetStoryResponse.Story.Cover.Figures["+ i +"].Emotion"));
			figuresItem21.setEmotionConfidence(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].EmotionConfidence"));
			figuresItem21.setFaceQuality(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].FaceQuality"));
			figuresItem21.setMouth(_ctx.stringValue("GetStoryResponse.Story.Cover.Figures["+ i +"].Mouth"));
			figuresItem21.setMouthConfidence(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].MouthConfidence"));
			figuresItem21.setBeard(_ctx.stringValue("GetStoryResponse.Story.Cover.Figures["+ i +"].Beard"));
			figuresItem21.setBeardConfidence(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].BeardConfidence"));
			figuresItem21.setHat(_ctx.stringValue("GetStoryResponse.Story.Cover.Figures["+ i +"].Hat"));
			figuresItem21.setHatConfidence(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].HatConfidence"));
			figuresItem21.setMask(_ctx.stringValue("GetStoryResponse.Story.Cover.Figures["+ i +"].Mask"));
			figuresItem21.setMaskConfidence(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].MaskConfidence"));
			figuresItem21.setGlasses(_ctx.stringValue("GetStoryResponse.Story.Cover.Figures["+ i +"].Glasses"));
			figuresItem21.setGlassesConfidence(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].GlassesConfidence"));
			figuresItem21.setSharpness(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].Sharpness"));
			figuresItem21.setAttractive(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].Attractive"));

			Boundary22 boundary22 = new Boundary22();
			boundary22.setWidth(_ctx.longValue("GetStoryResponse.Story.Cover.Figures["+ i +"].Boundary.Width"));
			boundary22.setHeight(_ctx.longValue("GetStoryResponse.Story.Cover.Figures["+ i +"].Boundary.Height"));
			boundary22.setLeft(_ctx.longValue("GetStoryResponse.Story.Cover.Figures["+ i +"].Boundary.Left"));
			boundary22.setTop(_ctx.longValue("GetStoryResponse.Story.Cover.Figures["+ i +"].Boundary.Top"));
			figuresItem21.setBoundary22(boundary22);

			HeadPose23 headPose23 = new HeadPose23();
			headPose23.setPitch(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].HeadPose.Pitch"));
			headPose23.setRoll(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].HeadPose.Roll"));
			headPose23.setYaw(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].HeadPose.Yaw"));
			figuresItem21.setHeadPose23(headPose23);

			figures12.add(figuresItem21);
		}
		cover.setFigures12(figures12);

		List<LabelsItem24> labels13 = new ArrayList<LabelsItem24>();
		for (int i = 0; i < _ctx.lengthValue("GetStoryResponse.Story.Cover.Labels.Length"); i++) {
			LabelsItem24 labelsItem24 = new LabelsItem24();
			labelsItem24.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Cover.Labels["+ i +"].Language"));
			labelsItem24.setLabelName(_ctx.stringValue("GetStoryResponse.Story.Cover.Labels["+ i +"].LabelName"));
			labelsItem24.setLabelLevel(_ctx.longValue("GetStoryResponse.Story.Cover.Labels["+ i +"].LabelLevel"));
			labelsItem24.setLabelConfidence(_ctx.floatValue("GetStoryResponse.Story.Cover.Labels["+ i +"].LabelConfidence"));
			labelsItem24.setParentLabelName(_ctx.stringValue("GetStoryResponse.Story.Cover.Labels["+ i +"].ParentLabelName"));
			labelsItem24.setCentricScore(_ctx.floatValue("GetStoryResponse.Story.Cover.Labels["+ i +"].CentricScore"));

			labels13.add(labelsItem24);
		}
		cover.setLabels13(labels13);

		List<CroppingSuggestionsItem25> croppingSuggestions14 = new ArrayList<CroppingSuggestionsItem25>();
		for (int i = 0; i < _ctx.lengthValue("GetStoryResponse.Story.Cover.CroppingSuggestions.Length"); i++) {
			CroppingSuggestionsItem25 croppingSuggestionsItem25 = new CroppingSuggestionsItem25();
			croppingSuggestionsItem25.setAspectRatio(_ctx.stringValue("GetStoryResponse.Story.Cover.CroppingSuggestions["+ i +"].AspectRatio"));
			croppingSuggestionsItem25.setConfidence(_ctx.floatValue("GetStoryResponse.Story.Cover.CroppingSuggestions["+ i +"].Confidence"));

			Boundary26 boundary26 = new Boundary26();
			boundary26.setWidth(_ctx.longValue("GetStoryResponse.Story.Cover.CroppingSuggestions["+ i +"].Boundary.Width"));
			boundary26.setHeight(_ctx.longValue("GetStoryResponse.Story.Cover.CroppingSuggestions["+ i +"].Boundary.Height"));
			boundary26.setLeft(_ctx.longValue("GetStoryResponse.Story.Cover.CroppingSuggestions["+ i +"].Boundary.Left"));
			boundary26.setTop(_ctx.longValue("GetStoryResponse.Story.Cover.CroppingSuggestions["+ i +"].Boundary.Top"));
			croppingSuggestionsItem25.setBoundary26(boundary26);

			croppingSuggestions14.add(croppingSuggestionsItem25);
		}
		cover.setCroppingSuggestions14(croppingSuggestions14);

		List<OCRContentsItem27> oCRContents15 = new ArrayList<OCRContentsItem27>();
		for (int i = 0; i < _ctx.lengthValue("GetStoryResponse.Story.Cover.OCRContents.Length"); i++) {
			OCRContentsItem27 oCRContentsItem27 = new OCRContentsItem27();
			oCRContentsItem27.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Cover.OCRContents["+ i +"].Language"));
			oCRContentsItem27.setContents(_ctx.stringValue("GetStoryResponse.Story.Cover.OCRContents["+ i +"].Contents"));
			oCRContentsItem27.setConfidence(_ctx.floatValue("GetStoryResponse.Story.Cover.OCRContents["+ i +"].Confidence"));

			Boundary28 boundary28 = new Boundary28();
			boundary28.setWidth(_ctx.longValue("GetStoryResponse.Story.Cover.OCRContents["+ i +"].Boundary.Width"));
			boundary28.setHeight(_ctx.longValue("GetStoryResponse.Story.Cover.OCRContents["+ i +"].Boundary.Height"));
			boundary28.setLeft(_ctx.longValue("GetStoryResponse.Story.Cover.OCRContents["+ i +"].Boundary.Left"));
			boundary28.setTop(_ctx.longValue("GetStoryResponse.Story.Cover.OCRContents["+ i +"].Boundary.Top"));
			oCRContentsItem27.setBoundary28(boundary28);

			oCRContents15.add(oCRContentsItem27);
		}
		cover.setOCRContents15(oCRContents15);

		List<VideoStreamsItem29> videoStreams16 = new ArrayList<VideoStreamsItem29>();
		for (int i = 0; i < _ctx.lengthValue("GetStoryResponse.Story.Cover.VideoStreams.Length"); i++) {
			VideoStreamsItem29 videoStreamsItem29 = new VideoStreamsItem29();
			videoStreamsItem29.setIndex(_ctx.longValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].Index"));
			videoStreamsItem29.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].Language"));
			videoStreamsItem29.setCodecName(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].CodecName"));
			videoStreamsItem29.setCodecLongName(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].CodecLongName"));
			videoStreamsItem29.setProfile(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].Profile"));
			videoStreamsItem29.setCodecTimeBase(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].CodecTimeBase"));
			videoStreamsItem29.setCodecTagString(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].CodecTagString"));
			videoStreamsItem29.setCodecTag(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].CodecTag"));
			videoStreamsItem29.setWidth(_ctx.longValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].Width"));
			videoStreamsItem29.setHeight(_ctx.longValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].Height"));
			videoStreamsItem29.setHasBFrames(_ctx.longValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].HasBFrames"));
			videoStreamsItem29.setSampleAspectRatio(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].SampleAspectRatio"));
			videoStreamsItem29.setDisplayAspectRatio(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].DisplayAspectRatio"));
			videoStreamsItem29.setPixelFormat(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].PixelFormat"));
			videoStreamsItem29.setLevel(_ctx.longValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].Level"));
			videoStreamsItem29.setFrameRate(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].FrameRate"));
			videoStreamsItem29.setAverageFrameRate(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].AverageFrameRate"));
			videoStreamsItem29.setTimeBase(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].TimeBase"));
			videoStreamsItem29.setStartTime(_ctx.doubleValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].StartTime"));
			videoStreamsItem29.setDuration(_ctx.doubleValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].Duration"));
			videoStreamsItem29.setBitrate(_ctx.longValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].Bitrate"));
			videoStreamsItem29.setFrameCount(_ctx.longValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].FrameCount"));
			videoStreamsItem29.setRotate(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].Rotate"));
			videoStreamsItem29.setBitDepth(_ctx.longValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].BitDepth"));
			videoStreamsItem29.setColorSpace(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].ColorSpace"));
			videoStreamsItem29.setColorRange(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].ColorRange"));
			videoStreamsItem29.setColorTransfer(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].ColorTransfer"));
			videoStreamsItem29.setColorPrimaries(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].ColorPrimaries"));

			videoStreams16.add(videoStreamsItem29);
		}
		cover.setVideoStreams16(videoStreams16);

		List<SubtitlesItem30> subtitles17 = new ArrayList<SubtitlesItem30>();
		for (int i = 0; i < _ctx.lengthValue("GetStoryResponse.Story.Cover.Subtitles.Length"); i++) {
			SubtitlesItem30 subtitlesItem30 = new SubtitlesItem30();
			subtitlesItem30.setIndex(_ctx.longValue("GetStoryResponse.Story.Cover.Subtitles["+ i +"].Index"));
			subtitlesItem30.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Cover.Subtitles["+ i +"].Language"));
			subtitlesItem30.setCodecName(_ctx.stringValue("GetStoryResponse.Story.Cover.Subtitles["+ i +"].CodecName"));
			subtitlesItem30.setCodecLongName(_ctx.stringValue("GetStoryResponse.Story.Cover.Subtitles["+ i +"].CodecLongName"));
			subtitlesItem30.setCodecTagString(_ctx.stringValue("GetStoryResponse.Story.Cover.Subtitles["+ i +"].CodecTagString"));
			subtitlesItem30.setCodecTag(_ctx.stringValue("GetStoryResponse.Story.Cover.Subtitles["+ i +"].CodecTag"));
			subtitlesItem30.setStartTime(_ctx.doubleValue("GetStoryResponse.Story.Cover.Subtitles["+ i +"].StartTime"));
			subtitlesItem30.setDuration(_ctx.doubleValue("GetStoryResponse.Story.Cover.Subtitles["+ i +"].Duration"));
			subtitlesItem30.setBitrate(_ctx.longValue("GetStoryResponse.Story.Cover.Subtitles["+ i +"].Bitrate"));
			subtitlesItem30.setContent(_ctx.stringValue("GetStoryResponse.Story.Cover.Subtitles["+ i +"].Content"));
			subtitlesItem30.setWidth(_ctx.longValue("GetStoryResponse.Story.Cover.Subtitles["+ i +"].Width"));
			subtitlesItem30.setHeight(_ctx.longValue("GetStoryResponse.Story.Cover.Subtitles["+ i +"].Height"));

			subtitles17.add(subtitlesItem30);
		}
		cover.setSubtitles17(subtitles17);

		List<AudioStreamsItem31> audioStreams18 = new ArrayList<AudioStreamsItem31>();
		for (int i = 0; i < _ctx.lengthValue("GetStoryResponse.Story.Cover.AudioStreams.Length"); i++) {
			AudioStreamsItem31 audioStreamsItem31 = new AudioStreamsItem31();
			audioStreamsItem31.setIndex(_ctx.longValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].Index"));
			audioStreamsItem31.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].Language"));
			audioStreamsItem31.setCodecName(_ctx.stringValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].CodecName"));
			audioStreamsItem31.setCodecLongName(_ctx.stringValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].CodecLongName"));
			audioStreamsItem31.setCodecTimeBase(_ctx.stringValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].CodecTimeBase"));
			audioStreamsItem31.setCodecTagString(_ctx.stringValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].CodecTagString"));
			audioStreamsItem31.setCodecTag(_ctx.stringValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].CodecTag"));
			audioStreamsItem31.setTimeBase(_ctx.stringValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].TimeBase"));
			audioStreamsItem31.setStartTime(_ctx.doubleValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].StartTime"));
			audioStreamsItem31.setDuration(_ctx.doubleValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].Duration"));
			audioStreamsItem31.setBitrate(_ctx.longValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].Bitrate"));
			audioStreamsItem31.setFrameCount(_ctx.longValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].FrameCount"));
			audioStreamsItem31.setLyric(_ctx.stringValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].Lyric"));
			audioStreamsItem31.setSampleFormat(_ctx.stringValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].SampleFormat"));
			audioStreamsItem31.setSampleRate(_ctx.longValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].SampleRate"));
			audioStreamsItem31.setChannels(_ctx.longValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].Channels"));
			audioStreamsItem31.setChannelLayout(_ctx.stringValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].ChannelLayout"));

			audioStreams18.add(audioStreamsItem31);
		}
		cover.setAudioStreams18(audioStreams18);

		List<AudioCoversItem32> audioCovers19 = new ArrayList<AudioCoversItem32>();
		for (int i = 0; i < _ctx.lengthValue("GetStoryResponse.Story.Cover.AudioCovers.Length"); i++) {
			AudioCoversItem32 audioCoversItem32 = new AudioCoversItem32();
			audioCoversItem32.setImageWidth(_ctx.longValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].ImageWidth"));
			audioCoversItem32.setImageHeight(_ctx.longValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].ImageHeight"));
			audioCoversItem32.setEXIF(_ctx.stringValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].EXIF"));

			ImageScore33 imageScore33 = new ImageScore33();
			imageScore33.setOverallQualityScore(_ctx.floatValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].ImageScore.OverallQualityScore"));
			audioCoversItem32.setImageScore33(imageScore33);

			List<CroppingSuggestionsItem36> croppingSuggestions34 = new ArrayList<CroppingSuggestionsItem36>();
			for (int j = 0; j < _ctx.lengthValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].CroppingSuggestions.Length"); j++) {
				CroppingSuggestionsItem36 croppingSuggestionsItem36 = new CroppingSuggestionsItem36();
				croppingSuggestionsItem36.setAspectRatio(_ctx.stringValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].CroppingSuggestions["+ j +"].AspectRatio"));
				croppingSuggestionsItem36.setConfidence(_ctx.floatValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].CroppingSuggestions["+ j +"].Confidence"));

				Boundary37 boundary37 = new Boundary37();
				boundary37.setWidth(_ctx.longValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].CroppingSuggestions["+ j +"].Boundary.Width"));
				boundary37.setHeight(_ctx.longValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].CroppingSuggestions["+ j +"].Boundary.Height"));
				boundary37.setLeft(_ctx.longValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].CroppingSuggestions["+ j +"].Boundary.Left"));
				boundary37.setTop(_ctx.longValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].CroppingSuggestions["+ j +"].Boundary.Top"));
				croppingSuggestionsItem36.setBoundary37(boundary37);

				croppingSuggestions34.add(croppingSuggestionsItem36);
			}
			audioCoversItem32.setCroppingSuggestions34(croppingSuggestions34);

			List<OCRContentsItem38> oCRContents35 = new ArrayList<OCRContentsItem38>();
			for (int j = 0; j < _ctx.lengthValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].OCRContents.Length"); j++) {
				OCRContentsItem38 oCRContentsItem38 = new OCRContentsItem38();
				oCRContentsItem38.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].OCRContents["+ j +"].Language"));
				oCRContentsItem38.setContents(_ctx.stringValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].OCRContents["+ j +"].Contents"));
				oCRContentsItem38.setConfidence(_ctx.floatValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].OCRContents["+ j +"].Confidence"));

				Boundary39 boundary39 = new Boundary39();
				boundary39.setWidth(_ctx.longValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].OCRContents["+ j +"].Boundary.Width"));
				boundary39.setHeight(_ctx.longValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].OCRContents["+ j +"].Boundary.Height"));
				boundary39.setLeft(_ctx.longValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].OCRContents["+ j +"].Boundary.Left"));
				boundary39.setTop(_ctx.longValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].OCRContents["+ j +"].Boundary.Top"));
				oCRContentsItem38.setBoundary39(boundary39);

				oCRContents35.add(oCRContentsItem38);
			}
			audioCoversItem32.setOCRContents35(oCRContents35);

			audioCovers19.add(audioCoversItem32);
		}
		cover.setAudioCovers19(audioCovers19);
		story.setCover(cover);

		List<FilesItem> files = new ArrayList<FilesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetStoryResponse.Story.Files.Length"); i++) {
			FilesItem filesItem = new FilesItem();
			filesItem.setOwnerId(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].OwnerId"));
			filesItem.setProjectName(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ProjectName"));
			filesItem.setDatasetName(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].DatasetName"));
			filesItem.setObjectType(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ObjectType"));
			filesItem.setObjectId(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ObjectId"));
			filesItem.setUpdateTime(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].UpdateTime"));
			filesItem.setCreateTime(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].CreateTime"));
			filesItem.setURI(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].URI"));
			filesItem.setOSSURI(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].OSSURI"));
			filesItem.setFilename(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Filename"));
			filesItem.setMediaType(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].MediaType"));
			filesItem.setContentType(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ContentType"));
			filesItem.setSize(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].Size"));
			filesItem.setFileHash(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].FileHash"));
			filesItem.setFileModifiedTime(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].FileModifiedTime"));
			filesItem.setFileCreateTime(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].FileCreateTime"));
			filesItem.setFileAccessTime(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].FileAccessTime"));
			filesItem.setProduceTime(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ProduceTime"));
			filesItem.setLatLong(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].LatLong"));
			filesItem.setTimezone(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Timezone"));
			filesItem.setTravelClusterId(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].TravelClusterId"));
			filesItem.setOrientation(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].Orientation"));
			filesItem.setFigureCount(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].FigureCount"));
			filesItem.setTitle(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Title"));
			filesItem.setImageWidth(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].ImageWidth"));
			filesItem.setImageHeight(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].ImageHeight"));
			filesItem.setEXIF(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].EXIF"));
			filesItem.setVideoWidth(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].VideoWidth"));
			filesItem.setVideoHeight(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].VideoHeight"));
			filesItem.setArtist(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Artist"));
			filesItem.setAlbumArtist(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AlbumArtist"));
			filesItem.setComposer(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Composer"));
			filesItem.setPerformer(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Performer"));
			filesItem.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Language"));
			filesItem.setAlbum(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Album"));
			filesItem.setDocumentLanguage(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].DocumentLanguage"));
			filesItem.setPageCount(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].PageCount"));
			filesItem.setDocumentContent(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].DocumentContent"));
			filesItem.setETag(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ETag"));
			filesItem.setCacheControl(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].CacheControl"));
			filesItem.setContentDisposition(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ContentDisposition"));
			filesItem.setContentEncoding(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ContentEncoding"));
			filesItem.setContentLanguage(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ContentLanguage"));
			filesItem.setAccessControlAllowOrigin(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AccessControlAllowOrigin"));
			filesItem.setAccessControlRequestMethod(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AccessControlRequestMethod"));
			filesItem.setServerSideEncryptionCustomerAlgorithm(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ServerSideEncryptionCustomerAlgorithm"));
			filesItem.setServerSideEncryption(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ServerSideEncryption"));
			filesItem.setServerSideDataEncryption(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ServerSideDataEncryption"));
			filesItem.setServerSideEncryptionKeyId(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ServerSideEncryptionKeyId"));
			filesItem.setOSSStorageClass(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].OSSStorageClass"));
			filesItem.setOSSCRC64(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].OSSCRC64"));
			filesItem.setObjectACL(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ObjectACL"));
			filesItem.setContentMd5(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ContentMd5"));
			filesItem.setOSSUserMeta(_ctx.mapValue("GetStoryResponse.Story.Files["+ i +"].OSSUserMeta"));
			filesItem.setOSSTaggingCount(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].OSSTaggingCount"));
			filesItem.setOSSTagging(_ctx.mapValue("GetStoryResponse.Story.Files["+ i +"].OSSTagging"));
			filesItem.setOSSExpiration(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].OSSExpiration"));
			filesItem.setOSSVersionId(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].OSSVersionId"));
			filesItem.setOSSDeleteMarker(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].OSSDeleteMarker"));
			filesItem.setOSSObjectType(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].OSSObjectType"));
			filesItem.setCustomId(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].CustomId"));
			filesItem.setCustomLabels(_ctx.mapValue("GetStoryResponse.Story.Files["+ i +"].CustomLabels"));
			filesItem.setStreamCount(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].StreamCount"));
			filesItem.setProgramCount(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].ProgramCount"));
			filesItem.setFormatName(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].FormatName"));
			filesItem.setFormatLongName(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].FormatLongName"));
			filesItem.setStartTime(_ctx.doubleValue("GetStoryResponse.Story.Files["+ i +"].StartTime"));
			filesItem.setBitrate(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].Bitrate"));
			filesItem.setDuration(_ctx.doubleValue("GetStoryResponse.Story.Files["+ i +"].Duration"));

			ImageScore imageScore = new ImageScore();
			imageScore.setOverallQualityScore(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].ImageScore.OverallQualityScore"));
			filesItem.setImageScore(imageScore);

			List<AddressesItem> addresses = new ArrayList<AddressesItem>();
			for (int j = 0; j < _ctx.lengthValue("GetStoryResponse.Story.Files["+ i +"].Addresses.Length"); j++) {
				AddressesItem addressesItem = new AddressesItem();
				addressesItem.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Addresses["+ j +"].Language"));
				addressesItem.setAddressLine(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Addresses["+ j +"].AddressLine"));
				addressesItem.setCountry(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Addresses["+ j +"].Country"));
				addressesItem.setProvince(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Addresses["+ j +"].Province"));
				addressesItem.setCity(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Addresses["+ j +"].City"));
				addressesItem.setDistrict(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Addresses["+ j +"].District"));
				addressesItem.setTownship(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Addresses["+ j +"].Township"));

				addresses.add(addressesItem);
			}
			filesItem.setAddresses(addresses);

			List<FiguresItem> figures = new ArrayList<FiguresItem>();
			for (int j = 0; j < _ctx.lengthValue("GetStoryResponse.Story.Files["+ i +"].Figures.Length"); j++) {
				FiguresItem figuresItem = new FiguresItem();
				figuresItem.setFigureId(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].FigureId"));
				figuresItem.setFigureConfidence(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].FigureConfidence"));
				figuresItem.setFigureClusterId(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].FigureClusterId"));
				figuresItem.setFigureClusterConfidence(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].FigureClusterConfidence"));
				figuresItem.setFigureType(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].FigureType"));
				figuresItem.setAge(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].Age"));
				figuresItem.setAgeSD(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].AgeSD"));
				figuresItem.setGender(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].Gender"));
				figuresItem.setGenderConfidence(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].GenderConfidence"));
				figuresItem.setEmotion(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].Emotion"));
				figuresItem.setEmotionConfidence(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].EmotionConfidence"));
				figuresItem.setFaceQuality(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].FaceQuality"));
				figuresItem.setMouth(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].Mouth"));
				figuresItem.setMouthConfidence(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].MouthConfidence"));
				figuresItem.setBeard(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].Beard"));
				figuresItem.setBeardConfidence(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].BeardConfidence"));
				figuresItem.setHat(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].Hat"));
				figuresItem.setHatConfidence(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].HatConfidence"));
				figuresItem.setMask(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].Mask"));
				figuresItem.setMaskConfidence(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].MaskConfidence"));
				figuresItem.setGlasses(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].Glasses"));
				figuresItem.setGlassesConfidence(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].GlassesConfidence"));
				figuresItem.setSharpness(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].Sharpness"));
				figuresItem.setAttractive(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].Attractive"));

				Boundary boundary = new Boundary();
				boundary.setWidth(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].Boundary.Width"));
				boundary.setHeight(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].Boundary.Height"));
				boundary.setLeft(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].Boundary.Left"));
				boundary.setTop(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].Boundary.Top"));
				figuresItem.setBoundary(boundary);

				HeadPose headPose = new HeadPose();
				headPose.setPitch(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].HeadPose.Pitch"));
				headPose.setRoll(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].HeadPose.Roll"));
				headPose.setYaw(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].HeadPose.Yaw"));
				figuresItem.setHeadPose(headPose);

				figures.add(figuresItem);
			}
			filesItem.setFigures(figures);

			List<LabelsItem> labels = new ArrayList<LabelsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetStoryResponse.Story.Files["+ i +"].Labels.Length"); j++) {
				LabelsItem labelsItem = new LabelsItem();
				labelsItem.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Labels["+ j +"].Language"));
				labelsItem.setLabelName(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Labels["+ j +"].LabelName"));
				labelsItem.setLabelLevel(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].Labels["+ j +"].LabelLevel"));
				labelsItem.setLabelConfidence(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Labels["+ j +"].LabelConfidence"));
				labelsItem.setParentLabelName(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Labels["+ j +"].ParentLabelName"));
				labelsItem.setCentricScore(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Labels["+ j +"].CentricScore"));

				labels.add(labelsItem);
			}
			filesItem.setLabels(labels);

			List<CroppingSuggestionsItem> croppingSuggestions = new ArrayList<CroppingSuggestionsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetStoryResponse.Story.Files["+ i +"].CroppingSuggestions.Length"); j++) {
				CroppingSuggestionsItem croppingSuggestionsItem = new CroppingSuggestionsItem();
				croppingSuggestionsItem.setAspectRatio(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].CroppingSuggestions["+ j +"].AspectRatio"));
				croppingSuggestionsItem.setConfidence(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].CroppingSuggestions["+ j +"].Confidence"));

				Boundary1 boundary1 = new Boundary1();
				boundary1.setWidth(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].CroppingSuggestions["+ j +"].Boundary.Width"));
				boundary1.setHeight(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].CroppingSuggestions["+ j +"].Boundary.Height"));
				boundary1.setLeft(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].CroppingSuggestions["+ j +"].Boundary.Left"));
				boundary1.setTop(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].CroppingSuggestions["+ j +"].Boundary.Top"));
				croppingSuggestionsItem.setBoundary1(boundary1);

				croppingSuggestions.add(croppingSuggestionsItem);
			}
			filesItem.setCroppingSuggestions(croppingSuggestions);

			List<OCRContentsItem> oCRContents = new ArrayList<OCRContentsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetStoryResponse.Story.Files["+ i +"].OCRContents.Length"); j++) {
				OCRContentsItem oCRContentsItem = new OCRContentsItem();
				oCRContentsItem.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].OCRContents["+ j +"].Language"));
				oCRContentsItem.setContents(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].OCRContents["+ j +"].Contents"));
				oCRContentsItem.setConfidence(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].OCRContents["+ j +"].Confidence"));

				Boundary2 boundary2 = new Boundary2();
				boundary2.setWidth(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].OCRContents["+ j +"].Boundary.Width"));
				boundary2.setHeight(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].OCRContents["+ j +"].Boundary.Height"));
				boundary2.setLeft(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].OCRContents["+ j +"].Boundary.Left"));
				boundary2.setTop(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].OCRContents["+ j +"].Boundary.Top"));
				oCRContentsItem.setBoundary2(boundary2);

				oCRContents.add(oCRContentsItem);
			}
			filesItem.setOCRContents(oCRContents);

			List<VideoStreamsItem> videoStreams = new ArrayList<VideoStreamsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams.Length"); j++) {
				VideoStreamsItem videoStreamsItem = new VideoStreamsItem();
				videoStreamsItem.setIndex(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].Index"));
				videoStreamsItem.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].Language"));
				videoStreamsItem.setCodecName(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].CodecName"));
				videoStreamsItem.setCodecLongName(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].CodecLongName"));
				videoStreamsItem.setProfile(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].Profile"));
				videoStreamsItem.setCodecTimeBase(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].CodecTimeBase"));
				videoStreamsItem.setCodecTagString(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].CodecTagString"));
				videoStreamsItem.setCodecTag(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].CodecTag"));
				videoStreamsItem.setWidth(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].Width"));
				videoStreamsItem.setHeight(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].Height"));
				videoStreamsItem.setHasBFrames(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].HasBFrames"));
				videoStreamsItem.setSampleAspectRatio(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].SampleAspectRatio"));
				videoStreamsItem.setDisplayAspectRatio(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].DisplayAspectRatio"));
				videoStreamsItem.setPixelFormat(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].PixelFormat"));
				videoStreamsItem.setLevel(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].Level"));
				videoStreamsItem.setFrameRate(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].FrameRate"));
				videoStreamsItem.setAverageFrameRate(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].AverageFrameRate"));
				videoStreamsItem.setTimeBase(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].TimeBase"));
				videoStreamsItem.setStartTime(_ctx.doubleValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].StartTime"));
				videoStreamsItem.setDuration(_ctx.doubleValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].Duration"));
				videoStreamsItem.setBitrate(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].Bitrate"));
				videoStreamsItem.setFrameCount(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].FrameCount"));
				videoStreamsItem.setRotate(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].Rotate"));
				videoStreamsItem.setBitDepth(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].BitDepth"));
				videoStreamsItem.setColorSpace(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].ColorSpace"));
				videoStreamsItem.setColorRange(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].ColorRange"));
				videoStreamsItem.setColorTransfer(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].ColorTransfer"));
				videoStreamsItem.setColorPrimaries(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].ColorPrimaries"));

				videoStreams.add(videoStreamsItem);
			}
			filesItem.setVideoStreams(videoStreams);

			List<SubtitlesItem> subtitles = new ArrayList<SubtitlesItem>();
			for (int j = 0; j < _ctx.lengthValue("GetStoryResponse.Story.Files["+ i +"].Subtitles.Length"); j++) {
				SubtitlesItem subtitlesItem = new SubtitlesItem();
				subtitlesItem.setIndex(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].Subtitles["+ j +"].Index"));
				subtitlesItem.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Subtitles["+ j +"].Language"));
				subtitlesItem.setCodecName(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Subtitles["+ j +"].CodecName"));
				subtitlesItem.setCodecLongName(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Subtitles["+ j +"].CodecLongName"));
				subtitlesItem.setCodecTagString(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Subtitles["+ j +"].CodecTagString"));
				subtitlesItem.setCodecTag(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Subtitles["+ j +"].CodecTag"));
				subtitlesItem.setStartTime(_ctx.doubleValue("GetStoryResponse.Story.Files["+ i +"].Subtitles["+ j +"].StartTime"));
				subtitlesItem.setDuration(_ctx.doubleValue("GetStoryResponse.Story.Files["+ i +"].Subtitles["+ j +"].Duration"));
				subtitlesItem.setBitrate(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].Subtitles["+ j +"].Bitrate"));
				subtitlesItem.setContent(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Subtitles["+ j +"].Content"));
				subtitlesItem.setWidth(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].Subtitles["+ j +"].Width"));
				subtitlesItem.setHeight(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].Subtitles["+ j +"].Height"));

				subtitles.add(subtitlesItem);
			}
			filesItem.setSubtitles(subtitles);

			List<AudioStreamsItem> audioStreams = new ArrayList<AudioStreamsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams.Length"); j++) {
				AudioStreamsItem audioStreamsItem = new AudioStreamsItem();
				audioStreamsItem.setIndex(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].Index"));
				audioStreamsItem.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].Language"));
				audioStreamsItem.setCodecName(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].CodecName"));
				audioStreamsItem.setCodecLongName(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].CodecLongName"));
				audioStreamsItem.setCodecTimeBase(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].CodecTimeBase"));
				audioStreamsItem.setCodecTagString(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].CodecTagString"));
				audioStreamsItem.setCodecTag(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].CodecTag"));
				audioStreamsItem.setTimeBase(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].TimeBase"));
				audioStreamsItem.setStartTime(_ctx.doubleValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].StartTime"));
				audioStreamsItem.setDuration(_ctx.doubleValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].Duration"));
				audioStreamsItem.setBitrate(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].Bitrate"));
				audioStreamsItem.setFrameCount(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].FrameCount"));
				audioStreamsItem.setLyric(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].Lyric"));
				audioStreamsItem.setSampleFormat(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].SampleFormat"));
				audioStreamsItem.setSampleRate(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].SampleRate"));
				audioStreamsItem.setChannels(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].Channels"));
				audioStreamsItem.setChannelLayout(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].ChannelLayout"));

				audioStreams.add(audioStreamsItem);
			}
			filesItem.setAudioStreams(audioStreams);

			List<AudioCoversItem> audioCovers = new ArrayList<AudioCoversItem>();
			for (int j = 0; j < _ctx.lengthValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers.Length"); j++) {
				AudioCoversItem audioCoversItem = new AudioCoversItem();
				audioCoversItem.setImageWidth(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].ImageWidth"));
				audioCoversItem.setImageHeight(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].ImageHeight"));
				audioCoversItem.setEXIF(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].EXIF"));

				ImageScore3 imageScore3 = new ImageScore3();
				imageScore3.setOverallQualityScore(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].ImageScore.OverallQualityScore"));
				audioCoversItem.setImageScore3(imageScore3);

				List<CroppingSuggestionsItem6> croppingSuggestions4 = new ArrayList<CroppingSuggestionsItem6>();
				for (int k = 0; k < _ctx.lengthValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].CroppingSuggestions.Length"); k++) {
					CroppingSuggestionsItem6 croppingSuggestionsItem6 = new CroppingSuggestionsItem6();
					croppingSuggestionsItem6.setAspectRatio(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].CroppingSuggestions["+ k +"].AspectRatio"));
					croppingSuggestionsItem6.setConfidence(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Confidence"));

					Boundary7 boundary7 = new Boundary7();
					boundary7.setWidth(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Boundary.Width"));
					boundary7.setHeight(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Boundary.Height"));
					boundary7.setLeft(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Boundary.Left"));
					boundary7.setTop(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Boundary.Top"));
					croppingSuggestionsItem6.setBoundary7(boundary7);

					croppingSuggestions4.add(croppingSuggestionsItem6);
				}
				audioCoversItem.setCroppingSuggestions4(croppingSuggestions4);

				List<OCRContentsItem8> oCRContents5 = new ArrayList<OCRContentsItem8>();
				for (int k = 0; k < _ctx.lengthValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].OCRContents.Length"); k++) {
					OCRContentsItem8 oCRContentsItem8 = new OCRContentsItem8();
					oCRContentsItem8.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].OCRContents["+ k +"].Language"));
					oCRContentsItem8.setContents(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].OCRContents["+ k +"].Contents"));
					oCRContentsItem8.setConfidence(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].OCRContents["+ k +"].Confidence"));

					Boundary9 boundary9 = new Boundary9();
					boundary9.setWidth(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].OCRContents["+ k +"].Boundary.Width"));
					boundary9.setHeight(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].OCRContents["+ k +"].Boundary.Height"));
					boundary9.setLeft(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].OCRContents["+ k +"].Boundary.Left"));
					boundary9.setTop(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].OCRContents["+ k +"].Boundary.Top"));
					oCRContentsItem8.setBoundary9(boundary9);

					oCRContents5.add(oCRContentsItem8);
				}
				audioCoversItem.setOCRContents5(oCRContents5);

				audioCovers.add(audioCoversItem);
			}
			filesItem.setAudioCovers(audioCovers);

			files.add(filesItem);
		}
		story.setFiles(files);
		getStoryResponse.setStory(story);
	 
	 	return getStoryResponse;
	}
}